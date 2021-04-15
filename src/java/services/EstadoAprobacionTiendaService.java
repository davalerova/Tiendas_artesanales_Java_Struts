/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import model.EstadoAprobacionTienda;
import model.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author daval
 */
public class EstadoAprobacionTiendaService {

    //findAll
    public List<EstadoAprobacionTienda> findAll() {
        List<EstadoAprobacionTienda> estadoAprobacionTiendas = new ArrayList<>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from EstadoAprobacionTienda");
        estadoAprobacionTiendas = query.list();
        tst.commit();
        return estadoAprobacionTiendas;
    }

    //findById
    public EstadoAprobacionTienda findById(int id) {
        EstadoAprobacionTienda estadoAprobacionTienda = new EstadoAprobacionTienda();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        estadoAprobacionTienda = (EstadoAprobacionTienda) ss.get(EstadoAprobacionTienda.class, id);
        tst.commit();
        return estadoAprobacionTienda;
    }

    //insert
    public void insert(EstadoAprobacionTienda estadoAprobacionTienda) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(estadoAprobacionTienda);
        ss.flush();
        tst.commit();
    }

    //update
    public void update(EstadoAprobacionTienda estadoAprobacionTienda) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.update(estadoAprobacionTienda);
        ss.flush();
        tst.commit();
    }

    //delete
    public void delete(EstadoAprobacionTienda estadoAprobacionTienda) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.delete(estadoAprobacionTienda);
        ss.flush();
        tst.commit();
    }
}
