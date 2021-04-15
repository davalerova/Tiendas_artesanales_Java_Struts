/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Departamento;
import services.DepartamentoService;

/**
 *
 * @author daval
 */


public class DepartamentoController {
    
    List<Departamento> listaDepartamentos = new ArrayList<>();
    DepartamentoService departamentoService = new DepartamentoService();
    Departamento departamento = new Departamento();
    int id;
    
    public void devolverTodos() {
        listaDepartamentos.clear();
        listaDepartamentos = departamentoService.findAll();
    }
    
    public void encontrarPorId() {
        departamento = new Departamento();
        departamento = departamentoService.findById(id);
    }
    
    public void insertar() {
        departamentoService.insert(departamento);
    }
    
    public void actualizar() {
        departamentoService.update(departamento);
    }
    
    public void eliminar() {
        departamentoService.delete(departamento);
        departamento = new Departamento();
    }
}
