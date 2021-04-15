/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import model.Rol;
import model.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author daval
 */
public class RolService {

    //findAll
    public List<Rol> findAll() {
        List<Rol> roles = new ArrayList<>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from Rol");
        roles = query.list();
        tst.commit();
        return roles;
    }

    //findById
    public Rol findById(int id) {
        Rol rol = new Rol();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        rol = (Rol) ss.get(Rol.class, id);
        tst.commit();
        return rol;
    }

    //insert
    public void insert(Rol rol) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(rol);
        ss.flush();
        tst.commit();
    }

    //update
    public void update(Rol rol) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.update(rol);
        ss.flush();
        tst.commit();
    }

    //delete
    public void delete(Rol rol) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.delete(rol);
        ss.flush();
        tst.commit();
    }
}
