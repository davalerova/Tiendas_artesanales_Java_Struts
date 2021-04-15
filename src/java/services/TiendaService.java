/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import model.Tienda;
import model.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author daval
 */
public class TiendaService {

    //findAll
    public List<Tienda> findAll() {
        List<Tienda> tiendas = new ArrayList<>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from Tienda");
        tiendas = query.list();
        tst.commit();
        return tiendas;
    }

    //findById
    public Tienda findById(int id) {
        Tienda tienda = new Tienda();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        tienda = (Tienda) ss.get(Tienda.class, id);
        tst.commit();
        return tienda;
    }

    //insert
    public void insert(Tienda tienda) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(tienda);
        ss.flush();
        tst.commit();
    }

    //update
    public void update(Tienda tienda) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.update(tienda);
        ss.flush();
        tst.commit();
    }

    //delete
    public void delete(Tienda tienda) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.delete(tienda);
        ss.flush();
        tst.commit();
    }
}
