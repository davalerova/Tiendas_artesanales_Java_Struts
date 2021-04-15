/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.EstadoAprobacionTienda;
import services.EstadoAprobacionTiendaService;

/**
 *
 * @author daval
 */


public class EstadoAprobacionTiendaController {
    
    List<EstadoAprobacionTienda> listaEstadoAprobacionTiendas = new ArrayList<>();
    EstadoAprobacionTiendaService estadoAprobacionTiendaService = new EstadoAprobacionTiendaService();
    EstadoAprobacionTienda estadoAprobacionTienda = new EstadoAprobacionTienda();
    int id;
    
    public void devolverTodos() {
        listaEstadoAprobacionTiendas.clear();
        listaEstadoAprobacionTiendas = estadoAprobacionTiendaService.findAll();
    }
    
    public void encontrarPorId() {
        estadoAprobacionTienda = new EstadoAprobacionTienda();
        estadoAprobacionTienda = estadoAprobacionTiendaService.findById(id);
    }
    
    public void insertar() {
        estadoAprobacionTiendaService.insert(estadoAprobacionTienda);
    }
    
    public void actualizar() {
        estadoAprobacionTiendaService.update(estadoAprobacionTienda);
    }
    
    public void eliminar() {
        estadoAprobacionTiendaService.delete(estadoAprobacionTienda);
        estadoAprobacionTienda = new EstadoAprobacionTienda();
    }
}
