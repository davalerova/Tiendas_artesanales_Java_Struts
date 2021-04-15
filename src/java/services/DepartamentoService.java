/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import model.Ciudad;
import model.Departamento;
import model.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author daval
 */
public class DepartamentoService {

    //findAll
    public List<Departamento> findAll() {
        List<Departamento> departamentos = new ArrayList<>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from Departamento");
        departamentos = query.list();
        tst.commit();
        return departamentos;
    }

    //findById
    public Departamento findById(int id) {
        Departamento departamento = new Departamento();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        departamento = (Departamento) ss.get(Departamento.class, id);
        tst.commit();
        return departamento;
    }

    //insert
    public void insert(Departamento departamento) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(departamento);
        ss.flush();
        tst.commit();
    }

    //update
    public void update(Departamento departamento) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.update(departamento);
        ss.flush();
        tst.commit();
    }

    //delete
    public void delete(Departamento departamento) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.delete(departamento);
        ss.flush();
        tst.commit();
    }
}
