/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Rol;
import services.RolService;

/**
 *
 * @author daval
 */


public class RolController {
    
    List<Rol> listaRoles = new ArrayList<>();
    RolService rolService = new RolService();
    Rol rol = new Rol();
    int id;
    
    public void devolverTodos() {
        listaRoles.clear();
        listaRoles = rolService.findAll();
    }
    
    public void encontrarPorId() {
        rol = new Rol();
        rol = rolService.findById(id);
    }
    
    public void insertar() {
        rolService.insert(rol);
    }
    
    public void actualizar() {
        rolService.update(rol);
    }
    
    public void eliminar() {
        rolService.delete(rol);
        rol = new Rol();
    }
}
