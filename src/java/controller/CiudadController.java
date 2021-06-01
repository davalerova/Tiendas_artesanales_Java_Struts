/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Ciudad;
import model.Departamento;
import org.apache.struts2.ServletActionContext;
import services.CiudadService;
import services.DepartamentoService;

/**
 *
 * @author daval
 */
public class CiudadController extends ActionSupport {

    List<Ciudad> listaCiudades = new ArrayList<>();
    List<Departamento> listaDepartamentos = new ArrayList<>();
    List<String> listaDepartamentosString = new ArrayList<>();
    private CiudadService ciudadService = new CiudadService();
    private DepartamentoService departamentoService = new DepartamentoService();
    private Ciudad ciudad = new Ciudad();
    String id;
    private String departamento;

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

    public String findCiudadById() {
        this.ciudad = this.ciudadService.findById(Integer.parseInt(this.id));
        if (this.ciudad == null || String.valueOf(this.ciudad.getId()) == null) {
            addFieldError("id", "La ciudad con número de id " + this.id + " no se encuentra registrada en el sistema");
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
        ciudad = ciudadService.findById(Integer.parseInt(id));
    }

    public String insertar() {
        ciudadService.insert(ciudad);
        return SUCCESS;
    }

    public String actualizar() {
        ciudadService.update(ciudad);
        return SUCCESS;
    }

    public String save() {
        ciudad.setDepartamento(departamentoService.findByDescripcion(departamento));
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
        listaDepartamentos = departamentoService.findAll();
        for (Departamento depar : listaDepartamentos) {
            listaDepartamentosString.add(depar.getDescripcion());
            System.out.println(depar.getDescripcion());
        }
        return SUCCESS;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<String> getListaDepartamentosString() {
        return listaDepartamentosString;
    }

    public void setListaDepartamentosString(List<String> listaDepartamentosString) {
        this.listaDepartamentosString = listaDepartamentosString;
    }

}
