/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import model.Producto;
import model.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author daval
 */
public class ProductoService {

    //findAll
    public List<Producto> findAll() {
        List<Producto> productos = new ArrayList<>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from Producto");
        productos = query.list();
        tst.commit();
        return productos;
    }

    //findById
    public Producto findById(int id) {
        Producto producto = new Producto();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        producto = (Producto) ss.get(Producto.class, id);
        tst.commit();
        return producto;
    }

    //insert
    public void insert(Producto producto) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(producto);
        ss.flush();
        tst.commit();
    }

    //update
    public void update(Producto producto) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.update(producto);
        ss.flush();
        tst.commit();
    }

    //delete
    public void delete(Producto producto) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.delete(producto);
        ss.flush();
        tst.commit();
    }
}
