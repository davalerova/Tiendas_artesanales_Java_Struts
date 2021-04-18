/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import services.UsuarioService;


/**
 *
 * @author daval
 */


public class UsuarioController extends ActionSupport{

    String nickname;
    String password;
    
    List<Usuario> listaUsuarios = new ArrayList<>();
    UsuarioService usuarioService = new UsuarioService();
    Usuario usuario = new Usuario();
    int id;
    
    public void devolverTodos() {
        listaUsuarios.clear();
        listaUsuarios = usuarioService.findAll();
    }
    
    @Override
    public String execute() throws Exception {
        System.out.println("Pruebaaaaa");
        return SUCCESS;
    }
    
    public void encontrarPorId() {
        usuario = new Usuario();
        usuario = usuarioService.findById(id);
    }
    
    public void insertar() {
        usuarioService.insert(usuario);
    }
    
    public void actualizar() {
        usuarioService.update(usuario);
    }
    
    public void eliminar() {
        usuarioService.delete(usuario);
        usuario = new Usuario();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    
    
    public String validarUsuario() {
        this.usuario = this.usuarioService.findByNickname(this.nickname);
        if (this.usuario == null || this.usuario.getNickname() == null) {
            addFieldError("id", "El usuario con nickname " + this.nickname + " no se encuentra registrado en el sistema");
            return INPUT;
        } if(usuario.getNickname() == this.nickname && usuario.getContrasena() == this.password){
            return SUCCESS;
        }else {
            addFieldError("contrasena", "Usuario o contraseña incorrectos");
            addFieldError("nickname", "Usuario o contraseña incorrectos");
            return INPUT;

        }
    }
}
