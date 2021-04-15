/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import model.FotoProducto;
import model.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author daval
 */
public class FotoProductoService {

    //findAll
    public List<FotoProducto> findAll() {
        List<FotoProducto> fotoProductos = new ArrayList<>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from FotoProducto");
        fotoProductos = query.list();
        tst.commit();
        return fotoProductos;
    }

    //findById
    public FotoProducto findById(int id) {
        FotoProducto fotoProducto = new FotoProducto();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        fotoProducto = (FotoProducto) ss.get(FotoProducto.class, id);
        tst.commit();
        return fotoProducto;
    }

    //insert
    public void insert(FotoProducto fotoProducto) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(fotoProducto);
        ss.flush();
        tst.commit();
    }

    //update
    public void update(FotoProducto fotoProducto) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.update(fotoProducto);
        ss.flush();
        tst.commit();
    }

    //delete
    public void delete(FotoProducto fotoProducto) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.delete(fotoProducto);
        ss.flush();
        tst.commit();
    }
}
