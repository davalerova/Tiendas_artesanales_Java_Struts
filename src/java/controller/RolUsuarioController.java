/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import model.RolUsuario;
import model.Rol;
import model.Usuario;
import services.RolUsuarioService;
import services.RolService;
import services.UsuarioService;

/**
 *
 * @author daval
 */
public class RolUsuarioController extends ActionSupport {

    List<RolUsuario> listaRolesUsuario = new ArrayList<>();
    List<Rol> listaRoles = new ArrayList<>();
    List<String> listaRolesString = new ArrayList<>();
    List<Usuario> listaUsuarios = new ArrayList<>();
    List<String> listaUsuariosString = new ArrayList<>();
    private RolUsuarioService rolUsuarioService = new RolUsuarioService();
    private RolService rolService = new RolService();
    private UsuarioService usuarioService = new UsuarioService();
    private RolUsuario rolUsuario = new RolUsuario();
    String id;
    private String rol;
    private String usuario;

    @Override
    public String execute() throws Exception {
        System.out.println("Pruebaaaaa"+this.id);
        System.out.println(this.id);
        return SUCCESS;
    }

    public String findRolUsuarioById() {
        this.rolUsuario = this.rolUsuarioService.findById(Integer.parseInt(this.id));
        if (this.rolUsuario == null || String.valueOf(this.rolUsuario.getId()) == null) {
            addFieldError("id", "El rol Usuario con número de id " + this.id + " no se encuentra registrada en el sistema");
            return INPUT;
        } else {
            return SUCCESS;

        }
    }

    public void devolverTodos() {
        listaRolesUsuario.clear();
        listaRolesUsuario = rolUsuarioService.findAll();
    }

    public void encontrarPorId() {
        rolUsuario = new RolUsuario();
        rolUsuario = rolUsuarioService.findById(Integer.parseInt(id));
    }

    public String insertar() {
        rolUsuarioService.insert(rolUsuario);
        return SUCCESS;
    }

    public String actualizar() {
        rolUsuarioService.update(rolUsuario);
        return SUCCESS;
    }
    
    public String save(){
        rolUsuario.setRol(rolService.findByDescripcion(rol));
        rolUsuario.setUsuario(usuarioService.findByNombres(usuario));
        rolUsuarioService.insert(rolUsuario);
        return SUCCESS;
    }

    public void eliminar() {
        rolUsuarioService.delete(rolUsuario);
        rolUsuario = new RolUsuario();
    }

    public String back() {
        return SUCCESS;
    }

    public String add() {
        rolUsuario = new RolUsuario();
        listaRoles = rolService.findAll();
        for(Rol rl: listaRoles){
            listaRolesString.add(rl.getDescripcion());
        }
        listaUsuarios = usuarioService.findAll();
        for(Usuario usr: listaUsuarios){
            listaUsuariosString.add(usr.getNombres());
        }
        return SUCCESS;
    }

    public List<RolUsuario> getListaRolesUsuario() {
        return listaRolesUsuario;
    }

    public void setListaRolesUsuario(List<RolUsuario> listaRolesUsuario) {
        this.listaRolesUsuario = listaRolesUsuario;
    }

    public List<Rol> getListaRoles() {
        return listaRoles;
    }

    public void setListaRoles(List<Rol> listaRoles) {
        this.listaRoles = listaRoles;
    }

    public List<String> getListaRolesString() {
        return listaRolesString;
    }

    public void setListaRolesString(List<String> listaRolesString) {
        this.listaRolesString = listaRolesString;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<String> getListaUsuariosString() {
        return listaUsuariosString;
    }

    public void setListaUsuariosString(List<String> listaUsuariosString) {
        this.listaUsuariosString = listaUsuariosString;
    }

    public RolUsuario getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(RolUsuario rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

   

    
    
}
