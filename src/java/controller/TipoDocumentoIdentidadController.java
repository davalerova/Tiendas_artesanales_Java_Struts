/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import model.TipoDocumentoIdentidad;
import services.TipoDocumentoIdentidadService;

/**
 *
 * @author daval
 */


public class TipoDocumentoIdentidadController extends ActionSupport {
    
    List<TipoDocumentoIdentidad> listaTiposDocumentoIdentidad = new ArrayList<>();
    TipoDocumentoIdentidadService tipoDocumentoIdentidadService = new TipoDocumentoIdentidadService();
    TipoDocumentoIdentidad tipoDocumentoIdentidad = new TipoDocumentoIdentidad();
    String id;
    
    public void devolverTodos() {
        listaTiposDocumentoIdentidad.clear();
        listaTiposDocumentoIdentidad = tipoDocumentoIdentidadService.findAll();
    }
    
    @Override
    public String execute() throws Exception {
        System.out.println("Pruebaaaaa"+this.id);
        System.out.println(this.id);
        return SUCCESS;
    }
    
    public String findTipoDocumentoIdentidadById() {
        this.tipoDocumentoIdentidad = this.tipoDocumentoIdentidadService.findById(Integer.parseInt(this.id));
        if (this.tipoDocumentoIdentidad == null || String.valueOf(this.tipoDocumentoIdentidad.getId()) == null) {
            addFieldError("id", "El tipo de documento con número de id " + this.id + " no se encuentra registrado en el sistema");
            return INPUT;
        } else {
            return SUCCESS;

        }
    }
    
    public void encontrarPorId() {
        tipoDocumentoIdentidad = new TipoDocumentoIdentidad();
        tipoDocumentoIdentidad = tipoDocumentoIdentidadService.findById(Integer.parseInt(id));
    }
    
    public void insertar() {
        tipoDocumentoIdentidadService.insert(tipoDocumentoIdentidad);
    }
    
    public void actualizar() {
        tipoDocumentoIdentidadService.update(tipoDocumentoIdentidad);
    }
    
    public String save(){
        tipoDocumentoIdentidadService.insert(tipoDocumentoIdentidad);
        return SUCCESS;
    }
    
    public void eliminar() {
        tipoDocumentoIdentidadService.delete(tipoDocumentoIdentidad);
        tipoDocumentoIdentidad = new TipoDocumentoIdentidad();
    }
    
    public String back(){
        return SUCCESS;
    }
    
    public String insertarTipoDocumentoIdentidad(){
        return SUCCESS;
    }

    public List<TipoDocumentoIdentidad> getListaTiposDocumentoIdentidad() {
        return listaTiposDocumentoIdentidad;
    }

    public void setListaTiposDocumentoIdentidad(List<TipoDocumentoIdentidad> listaTiposDocumentoIdentidad) {
        this.listaTiposDocumentoIdentidad = listaTiposDocumentoIdentidad;
    }

    public TipoDocumentoIdentidadService getTipoDocumentoIdentidadService() {
        return tipoDocumentoIdentidadService;
    }

    public void setTipoDocumentoIdentidadService(TipoDocumentoIdentidadService tipoDocumentoIdentidadService) {
        this.tipoDocumentoIdentidadService = tipoDocumentoIdentidadService;
    }

    public TipoDocumentoIdentidad getTipoDocumentoIdentidad() {
        return tipoDocumentoIdentidad;
    }

    public void setTipoDocumentoIdentidad(TipoDocumentoIdentidad tipoDocumentoIdentidad) {
        this.tipoDocumentoIdentidad = tipoDocumentoIdentidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
