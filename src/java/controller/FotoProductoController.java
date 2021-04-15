/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.FotoProducto;
import services.FotoProductoService;

/**
 *
 * @author daval
 */


public class FotoProductoController {
    
    List<FotoProducto> listaFotosProductos = new ArrayList<>();
    FotoProductoService fotoProductoService = new FotoProductoService();
    FotoProducto fotoProducto = new FotoProducto();
    int id;
    
    public void devolverTodos() {
        listaFotosProductos.clear();
        listaFotosProductos = fotoProductoService.findAll();
    }
    
    public void encontrarPorId() {
        fotoProducto = new FotoProducto();
        fotoProducto = fotoProductoService.findById(id);
    }
    
    public void insertar() {
        fotoProductoService.insert(fotoProducto);
    }
    
    public void actualizar() {
        fotoProductoService.update(fotoProducto);
    }
    
    public void eliminar() {
        fotoProductoService.delete(fotoProducto);
        fotoProducto = new FotoProducto();
    }
}
