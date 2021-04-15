/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.EstadoAprobacionRolUsuario;
import services.EstadoAprobacionRolUsuarioService;

/**
 *
 * @author daval
 */


public class EstadoAprobacionRolUsuarioController {
    
    List<EstadoAprobacionRolUsuario> listaEstadoAprobacionRolUsuarios = new ArrayList<>();
    EstadoAprobacionRolUsuarioService estadoAprobacionRolUsuarioService = new EstadoAprobacionRolUsuarioService();
    EstadoAprobacionRolUsuario estadoAprobacionRolUsuario = new EstadoAprobacionRolUsuario();
    int id;
    
    public void devolverTodos() {
        listaEstadoAprobacionRolUsuarios.clear();
        listaEstadoAprobacionRolUsuarios = estadoAprobacionRolUsuarioService.findAll();
    }
    
    public void encontrarPorId() {
        estadoAprobacionRolUsuario = new EstadoAprobacionRolUsuario();
        estadoAprobacionRolUsuario = estadoAprobacionRolUsuarioService.findById(id);
    }
    
    public void insertar() {
        estadoAprobacionRolUsuarioService.insert(estadoAprobacionRolUsuario);
    }
    
    public void actualizar() {
        estadoAprobacionRolUsuarioService.update(estadoAprobacionRolUsuario);
    }
    
    public void eliminar() {
        estadoAprobacionRolUsuarioService.delete(estadoAprobacionRolUsuario);
        estadoAprobacionRolUsuario = new EstadoAprobacionRolUsuario();
    }
}
