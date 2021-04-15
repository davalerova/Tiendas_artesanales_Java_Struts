/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.TipoDocumentoIdentidad;
import services.TipoDocumentoIdentidadService;

/**
 *
 * @author daval
 */


public class TipoDocumentoIdentidadController {
    
    List<TipoDocumentoIdentidad> listaTiposDocumentoIdentidad = new ArrayList<>();
    TipoDocumentoIdentidadService tipoDocumentoIdentidadService = new TipoDocumentoIdentidadService();
    TipoDocumentoIdentidad tipoDocumentoIdentidad = new TipoDocumentoIdentidad();
    int id;
    
    public void devolverTodos() {
        listaTiposDocumentoIdentidad.clear();
        listaTiposDocumentoIdentidad = tipoDocumentoIdentidadService.findAll();
    }
    
    public void encontrarPorId() {
        tipoDocumentoIdentidad = new TipoDocumentoIdentidad();
        tipoDocumentoIdentidad = tipoDocumentoIdentidadService.findById(id);
    }
    
    public void insertar() {
        tipoDocumentoIdentidadService.insert(tipoDocumentoIdentidad);
    }
    
    public void actualizar() {
        tipoDocumentoIdentidadService.update(tipoDocumentoIdentidad);
    }
    
    public void eliminar() {
        tipoDocumentoIdentidadService.delete(tipoDocumentoIdentidad);
        tipoDocumentoIdentidad = new TipoDocumentoIdentidad();
    }
}
