/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Tienda;
import services.TiendaService;

/**
 *
 * @author daval
 */


public class TiendaController {
    
    List<Tienda> listaTiendas = new ArrayList<>();
    TiendaService tiendaService = new TiendaService();
    Tienda tienda = new Tienda();
    int id;
    
    public void devolverTodos() {
        listaTiendas.clear();
        listaTiendas = tiendaService.findAll();
    }
    
    public void encontrarPorId() {
        tienda = new Tienda();
        tienda = tiendaService.findById(id);
    }
    
    public void insertar() {
        tiendaService.insert(tienda);
    }
    
    public void actualizar() {
        tiendaService.update(tienda);
    }
    
    public void eliminar() {
        tiendaService.delete(tienda);
        tienda = new Tienda();
    }
}
