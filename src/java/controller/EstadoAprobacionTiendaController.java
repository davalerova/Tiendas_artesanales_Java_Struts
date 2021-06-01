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
import model.EstadoAprobacionTienda;
import org.apache.struts2.ServletActionContext;
import services.EstadoAprobacionTiendaService;

/**
 *
 * @author daval
 */


public class EstadoAprobacionTiendaController extends ActionSupport{
    
    List<EstadoAprobacionTienda> listaEstadoAprobacionTiendas = new ArrayList<>();
    EstadoAprobacionTiendaService estadoAprobacionTiendaService = new EstadoAprobacionTiendaService();
    EstadoAprobacionTienda estadoAprobacionTienda = new EstadoAprobacionTienda();
    int id;
    
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
