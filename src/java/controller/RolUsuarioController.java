/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.RolUsuario;
import services.RolUsuarioService;

/**
 *
 * @author daval
 */


public class RolUsuarioController {
    
    List<RolUsuario> listaRolesUsuario = new ArrayList<>();
    RolUsuarioService rolUsuarioService = new RolUsuarioService();
    RolUsuario rolUsuario = new RolUsuario();
    int id;
    
    public void devolverTodos() {
        listaRolesUsuario.clear();
        listaRolesUsuario = rolUsuarioService.findAll();
    }
    
    public void encontrarPorId() {
        rolUsuario = new RolUsuario();
        rolUsuario = rolUsuarioService.findById(id);
    }
    
    public void insertar() {
        rolUsuarioService.insert(rolUsuario);
    }
    
    public void actualizar() {
        rolUsuarioService.update(rolUsuario);
    }
    
    public void eliminar() {
        rolUsuarioService.delete(rolUsuario);
        rolUsuario = new RolUsuario();
    }
}
