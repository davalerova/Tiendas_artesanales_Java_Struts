/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import model.Ciudad;
import services.CiudadService;

/**
 *
 * @author daval
 */
public class CiudadController extends ActionSupport {

    List<Ciudad> listaCiudades = new ArrayList<>();
    private CiudadService ciudadService = new CiudadService();
    private Ciudad ciudad = new Ciudad();
    int id;

    @Override
    public String execute() throws Exception {
        System.out.println("Pruebaaaaa"+this.id);
        System.out.println(this.id);
        return SUCCESS;
    }

    public String findCiudadById() {
        this.ciudad = this.ciudadService.findById(this.id);
        if (this.ciudad == null || String.valueOf(this.ciudad.getId()) == null) {
            addFieldError("id", "La ciudad con número de id " + id + " no se encuentra registrada en el sistema");
            return INPUT;
        } else {
            return SUCCESS;

        }
    }

    public void devolverTodos() {
        listaCiudades.clear();
        listaCiudades = ciudadService.findAll();
    }

    public void encontrarPorId() {
        ciudad = new Ciudad();
        ciudad = ciudadService.findById(id);
    }

    public String insertar() {
        ciudadService.insert(ciudad);
        return SUCCESS;
    }

    public String actualizar() {
        ciudadService.update(ciudad);
        return SUCCESS;
    }
    
    public String save(){
        ciudadService.insert(ciudad);
        return SUCCESS;
    }

    public void eliminar() {
        ciudadService.delete(ciudad);
        ciudad = new Ciudad();
    }

    public String back() {
        return SUCCESS;
    }

    public String add() {
        ciudad = new Ciudad();
        return SUCCESS;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getId() {
        return String.valueOf(id);
    }
}
