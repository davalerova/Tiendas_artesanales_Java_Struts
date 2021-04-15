/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import model.Ciudad;
import model.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author daval
 */
public class CiudadService {

    //findAll
    public List<Ciudad> findAll() {
        List<Ciudad> ciudades = new ArrayList<>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from Ciudad");
        ciudades = query.list();
        tst.commit();
        return ciudades;
    }

    //findById
    public Ciudad findById(int id) {
        Ciudad ciudad = new Ciudad();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ciudad = (Ciudad) ss.get(Ciudad.class, id);
        tst.commit();
        return ciudad;
    }

    //insert
    public void insert(Ciudad ciudad) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(ciudad);
        ss.flush();
        tst.commit();
    }

    //update
    public void update(Ciudad ciudad) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.update(ciudad);
        ss.flush();
        tst.commit();
    }

    //delete
    public void delete(Ciudad ciudad) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.delete(ciudad);
        ss.flush();
        tst.commit();
    }
    
    
}
