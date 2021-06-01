/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Rol;
import org.apache.struts2.ServletActionContext;
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
        if (this.validarSesion()) {
            return SUCCESS;
        } else {
            return ERROR;
        }

    }

    public boolean validarSesion() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        String s = (String) session.getAttribute("login");
        if (s != null && !s.equals("")) {
            return true;
        } else {
            return false;
        }
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
