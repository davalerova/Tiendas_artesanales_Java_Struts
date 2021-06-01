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
import model.EstadoAprobacionRolUsuario;
import org.apache.struts2.ServletActionContext;
import services.EstadoAprobacionRolUsuarioService;

/**
 *
 * @author daval
 */


public class EstadoAprobacionRolUsuarioController extends ActionSupport{
    
    List<EstadoAprobacionRolUsuario> listaEstadoAprobacionRolUsuarios = new ArrayList<>();
    EstadoAprobacionRolUsuarioService estadoAprobacionRolUsuarioService = new EstadoAprobacionRolUsuarioService();
    EstadoAprobacionRolUsuario estadoAprobacionRolUsuario = new EstadoAprobacionRolUsuario();
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
        listaEstadoAprobacionRolUsuarios.clear();
        listaEstadoAprobacionRolUsuarios = estadoAprobacionRolUsuarioService.findAll();
    }
    
    public void encontrarPorId() {
        estadoAprobacionRolUsuario = new EstadoAprobacionRolUsuario();
        estadoAprobacionRolUsuario = estadoAprobacionRolUsuarioService.findById(id);
    }
    
    public void insertar() {
        estadoAprobacionRolUsuarioService.insert(estadoAprobacionRolUsuario);
    }
    
    public void actualizar() {
        estadoAprobacionRolUsuarioService.update(estadoAprobacionRolUsuario);
    }
    
    public void eliminar() {
        estadoAprobacionRolUsuarioService.delete(estadoAprobacionRolUsuario);
        estadoAprobacionRolUsuario = new EstadoAprobacionRolUsuario();
    }
}
