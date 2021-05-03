/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import model.Producto;
import model.Tienda;
import services.ProductoService;
import services.TiendaService;

/**
 *
 * @author daval
 */
public class ProductoController extends ActionSupport {

    List<Producto> listaProductos = new ArrayList<>();
    List<Tienda> listaTiendas = new ArrayList<>();
    List<String> listaTiendasString = new ArrayList<>();
    private ProductoService productoService = new ProductoService();
    private TiendaService tiendaService = new TiendaService();
    private Producto producto = new Producto();
    String id;
    private String tienda;

    @Override
    public String execute() throws Exception {
        System.out.println("Pruebaaaaa"+this.id);
        System.out.println(this.id);
        return SUCCESS;
    }

    public String findProductoById() {
        this.producto = this.productoService.findById(Integer.parseInt(this.id));
        if (this.producto == null || String.valueOf(this.producto.getId()) == null) {
            addFieldError("id", "El producto con número de id " + this.id + " no se encuentra registrado en el sistema");
            return INPUT;
        } else {
            return SUCCESS;

        }
    }

    public void devolverTodos() {
        listaProductos.clear();
        listaProductos = productoService.findAll();
    }

    public void encontrarPorId() {
        producto = new Producto();
        producto = productoService.findById(Integer.parseInt(id));
    }

    public String insertar() {
        productoService.insert(producto);
        return SUCCESS;
    }

    public String actualizar() {
        productoService.update(producto);
        return SUCCESS;
    }
    
    public String save(){
        producto.setTienda(tiendaService.findByDescripcion(tienda));
        productoService.insert(producto);
        return SUCCESS;
    }

    public void eliminar() {
        productoService.delete(producto);
        producto = new Producto();
    }

    public String back() {
        return SUCCESS;
    }

    public String add() {
        producto = new Producto();
        listaTiendas = tiendaService.findAll();
        for(Tienda tnd: listaTiendas){
            listaTiendasString.add(tnd.getNombre());
        }
        return SUCCESS;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Tienda> getListaTiendas() {
        return listaTiendas;
    }

    public void setListaTiendas(List<Tienda> listaTiendas) {
        this.listaTiendas = listaTiendas;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public List<String> getListaTiendasString() {
        return listaTiendasString;
    }

    public void setListaTiendasString(List<String> listaTiendasString) {
        this.listaTiendasString = listaTiendasString;
    }

    
}
