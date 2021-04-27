/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import model.Rol;
import services.RolService;

/**
 *
 * @author daval
 */


public class RolController extends ActionSupport{
    
    List<Rol> listaRols = new ArrayList<>();
    RolService rolService = new RolService();
    Rol rol = new Rol();
    String id;
    
    public List<Rol> devolverTodos() {
        listaRols.clear();
        listaRols = rolService.findAll();
        return listaRols;
    }
    
    @Override
    public String execute() throws Exception {
        System.out.println("Pruebaaaaa"+this.id);
        System.out.println(this.id);
        return SUCCESS;
    }
    
    public String findRolById() {
        this.rol = this.rolService.findById(Integer.parseInt(this.id));
        if (this.rol == null || String.valueOf(this.rol.getId()) == null) {
            addFieldError("id", "El rol con número de id " + this.id + " no se encuentra registrado en el sistema");
            return INPUT;
        } else {
            return SUCCESS;

        }
    }
    
    public void insertar() {
        rolService.insert(rol);
    }
    
    public void actualizar() {
        rolService.update(rol);
    }
    
    public String save(){
        rolService.insert(rol);
        return SUCCESS;
    }
    
    public void eliminar() {
        rolService.delete(rol);
        rol = new Rol();
    }
    
    public String insertarRol(){
        return SUCCESS;
    }

    public List<Rol> getListaRols() {
        return listaRols;
    }

    public void setListaRols(List<Rol> listaRols) {
        this.listaRols = listaRols;
    }

    public RolService getRolService() {
        return rolService;
    }

    public void setRolService(RolService rolService) {
        this.rolService = rolService;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String add() {
        rol = new Rol();
        
        return SUCCESS;
    }
    
    public String back(){
        return SUCCESS;
    }
    
    
    
}
