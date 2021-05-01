/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import model.Tienda;
import model.Usuario;
import services.TiendaService;
import services.UsuarioService;

/**
 *
 * @author daval
 */
public class TiendaController extends ActionSupport {

    List<Tienda> listaTiendas = new ArrayList<>();
    List<Usuario> listaUsuarios = new ArrayList<>();
    List<String> listaUsuariosString = new ArrayList<>();
    private TiendaService tiendaService = new TiendaService();
    private UsuarioService usuarioService = new UsuarioService();
    private Tienda tienda = new Tienda();
    String id;
    private String usuario;

    @Override
    public String execute() throws Exception {
        System.out.println("Pruebaaaaa"+this.id);
        System.out.println(this.id);
        return SUCCESS;
    }

    public String findTiendaById() {
        this.tienda = this.tiendaService.findById(Integer.parseInt(this.id));
        if (this.tienda == null || String.valueOf(this.tienda.getId()) == null) {
            addFieldError("id", "La tienda con número de id " + this.id + " no se encuentra registrada en el sistema");
            return INPUT;
        } else {
            return SUCCESS;

        }
    }

    public void devolverTodos() {
        listaTiendas.clear();
        listaTiendas = tiendaService.findAll();
    }

    public void encontrarPorId() {
        tienda = new Tienda();
        tienda = tiendaService.findById(Integer.parseInt(id));
    }

    public String insertar() {
        tiendaService.insert(tienda);
        return SUCCESS;
    }

    public String actualizar() {
        tiendaService.update(tienda);
        return SUCCESS;
    }
    
    public String save(){
        tienda.setUsuario(usuarioService.findByNumeroDocumentoIdentidad(usuario));
        tiendaService.insert(tienda);
        return SUCCESS;
    }

    public void eliminar() {
        tiendaService.delete(tienda);
        tienda = new Tienda();
    }

    public String back() {
        return SUCCESS;
    }

    public String add() {
        tienda = new Tienda();
        listaUsuarios = usuarioService.findAll();
        for(Usuario usr: listaUsuarios){
            listaUsuariosString.add(usr.getNumeroDocumentoIdentidad());
        }
        return SUCCESS;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<String> getListaUsuariosString() {
        return listaUsuariosString;
    }

    public void setListaUsuariosString(List<String> listaUsuariosString) {
        this.listaUsuariosString = listaUsuariosString;
    }

    
}
