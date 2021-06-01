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
import model.FotoProducto;
import org.apache.struts2.ServletActionContext;
import services.FotoProductoService;

/**
 *
 * @author daval
 */


public class FotoProductoController extends ActionSupport{
    
    List<FotoProducto> listaFotosProductos = new ArrayList<>();
    FotoProductoService fotoProductoService = new FotoProductoService();
    FotoProducto fotoProducto = new FotoProducto();
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
