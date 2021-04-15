/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Departamento;
import services.DepartamentoService;

/**
 *
 * @author daval
 */


public class ProductoController {
    
    List<Departamento> listaProductos = new ArrayList<>();
    DepartamentoService productoService = new DepartamentoService();
    Departamento producto = new Departamento();
    int id;
    
    public void devolverTodos() {
        listaProductos.clear();
        listaProductos = productoService.findAll();
    }
    
    public void encontrarPorId() {
        producto = new Departamento();
        producto = productoService.findById(id);
    }
    
    public void insertar() {
        productoService.insert(producto);
    }
    
    public void actualizar() {
        productoService.update(producto);
    }
    
    public void eliminar() {
        productoService.delete(producto);
        producto = new Departamento();
    }
}
