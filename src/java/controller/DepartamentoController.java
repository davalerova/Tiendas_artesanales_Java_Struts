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
import model.Departamento;
import org.apache.struts2.ServletActionContext;
import services.DepartamentoService;

/**
 *
 * @author daval
 */


public class DepartamentoController extends ActionSupport{
    
    List<Departamento> listaDepartamentos = new ArrayList<>();
    DepartamentoService departamentoService = new DepartamentoService();
    Departamento departamento = new Departamento();
    String id;
    
    public List<Departamento> devolverTodos() {
        listaDepartamentos.clear();
        listaDepartamentos = departamentoService.findAll();
        return listaDepartamentos;
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
    
    public String findDepartamentoById() {
        this.departamento = this.departamentoService.findById(Integer.parseInt(this.id));
        if (this.departamento == null || String.valueOf(this.departamento.getId()) == null) {
            addFieldError("id", "El departamento con número de id " + this.id + " no se encuentra registrado en el sistema");
            return INPUT;
        } else {
            return SUCCESS;

        }
    }
    
    public void insertar() {
        departamentoService.insert(departamento);
    }
    
    public void actualizar() {
        departamentoService.update(departamento);
    }
    
    public String save(){
        departamentoService.insert(departamento);
        return SUCCESS;
    }
    
    public void eliminar() {
        departamentoService.delete(departamento);
        departamento = new Departamento();
    }
    
    public String insertarDepartamento(){
        return SUCCESS;
    }

    public List<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public DepartamentoService getDepartamentoService() {
        return departamentoService;
    }

    public void setDepartamentoService(DepartamentoService departamentoService) {
        this.departamentoService = departamentoService;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String add() {
        departamento = new Departamento();
        
        return SUCCESS;
    }
    
    public String back(){
        return SUCCESS;
    }
    
    
    
}
