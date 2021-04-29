/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import model.Ciudad;
import model.Rol;
import model.RolUsuario;
import model.Usuario;
import model.TipoDocumentoIdentidad;
import services.CiudadService;
import services.RolService;
import services.RolUsuarioService;
import services.UsuarioService;
import services.TipoDocumentoIdentidadService;

/**
 *
 * @author daval
 */
public class UsuarioController extends ActionSupport {

    List<Usuario> listaUsuarios = new ArrayList<>();
    List<TipoDocumentoIdentidad> listaTiposDocumentoIdentidad = new ArrayList<>();
    List<String> listaTiposDocumentoIdentidadString = new ArrayList<>();
    List<Ciudad> listaCiudades = new ArrayList<>();
    List<String> listaCiudadesString = new ArrayList<>();
    private UsuarioService usuarioService = new UsuarioService();
    private TipoDocumentoIdentidadService tipoDocumentoIdentidadService = new TipoDocumentoIdentidadService();
    private CiudadService ciudadService = new CiudadService();
    private Usuario usuario = new Usuario();
    String id;
    private String tipoDocumentoIdentidad;
    private String ciudad;
    private RolUsuario rolUsuario;
    private RolService rolService = new RolService();
    private RolUsuarioService rolUsuarioService = new RolUsuarioService();
    private Rol rol = new Rol();

    @Override
    public String execute() throws Exception {
        System.out.println("Pruebaaaaa"+this.id);
        System.out.println(this.id);
        return SUCCESS;
    }

    public String findUsuarioById() {
        this.usuario = this.usuarioService.findById(Integer.parseInt(this.id));
        if (this.usuario == null || String.valueOf(this.usuario.getId()) == null) {
            addFieldError("id", "El usuario con número de id " + this.id + " no se encuentra registrada en el sistema");
            return INPUT;
        } else {
            return SUCCESS;

        }
    }

    public void devolverTodos() {
        listaUsuarios.clear();
        listaUsuarios = usuarioService.findAll();
    }

    public void encontrarPorId() {
        usuario = new Usuario();
        usuario = usuarioService.findById(Integer.parseInt(id));
    }

    public String insertar() {
        usuarioService.insert(usuario);
        return SUCCESS;
    }

    public String actualizar() {
        usuarioService.update(usuario);
        return SUCCESS;
    }
    
    public String save(){
        usuario.setTipoDocumentoIdentidad(tipoDocumentoIdentidadService.findByDescripcion("Cédula de ciudadanía"));
        usuario.setCiudad(ciudadService.findByDescripcion(ciudad));
        rol = rolService.findById(4);
        
        
        System.out.println("Ayudaaaaaaaaa");
        System.out.println(usuario);
        usuarioService.insert(usuario);
        return SUCCESS;
    }

    public void eliminar() {
        usuarioService.delete(usuario);
        usuario = new Usuario();
    }

    public String back() {
        return SUCCESS;
    }

    public String add() {
        usuario = new Usuario();
        listaTiposDocumentoIdentidad = tipoDocumentoIdentidadService.findAll();
        for(TipoDocumentoIdentidad tipoDocumento: listaTiposDocumentoIdentidad){
            listaTiposDocumentoIdentidadString.add(tipoDocumento.getDescripcion());
            System.out.println("Prueba lista tipo documento identidad: "+tipoDocumento.getDescripcion());
        }
        
        listaCiudades = ciudadService.findAll();
        for(Ciudad ciud: listaCiudades){
            listaCiudadesString.add(ciud.getDescripcion());
        }
        return SUCCESS;
    }
    
    public String insertarUsuarioCliente(){
        return SUCCESS;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<TipoDocumentoIdentidad> getListaTiposDocumentoIdentidad() {
        return listaTiposDocumentoIdentidad;
    }

    public void setListaTiposDocumentoIdentidad(List<TipoDocumentoIdentidad> listaTiposDocumentoIdentidad) {
        this.listaTiposDocumentoIdentidad = listaTiposDocumentoIdentidad;
    }

    public List<String> getListaTiposDocumentoIdentidadString() {
        return listaTiposDocumentoIdentidadString;
    }

    public void setListaTiposDocumentoIdentidadString(List<String> listaTiposDocumentoIdentidadString) {
        this.listaTiposDocumentoIdentidadString = listaTiposDocumentoIdentidadString;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Ciudad> getListaCiudades() {
        return listaCiudades;
    }

    public void setListaCiudades(List<Ciudad> listaCiudades) {
        this.listaCiudades = listaCiudades;
    }

    public List<String> getListaCiudadesString() {
        return listaCiudadesString;
    }

    public void setListaCiudadesString(List<String> listaCiudadesString) {
        this.listaCiudadesString = listaCiudadesString;
    }

    public CiudadService getCiudadService() {
        return ciudadService;
    }

    public void setCiudadService(CiudadService ciudadService) {
        this.ciudadService = ciudadService;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    
    
    
}
