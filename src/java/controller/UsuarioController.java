/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import services.UsuarioService;

/**
 *
 * @author daval
 */


public class UsuarioController {
    
    List<Usuario> listaUsuarios = new ArrayList<>();
    UsuarioService usuarioService = new UsuarioService();
    Usuario usuario = new Usuario();
    int id;
    
    public void devolverTodos() {
        listaUsuarios.clear();
        listaUsuarios = usuarioService.findAll();
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
}
