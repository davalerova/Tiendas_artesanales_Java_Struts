/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import model.RolUsuario;
import model.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author daval
 */
public class RolUsuarioService {

    //findAll
    public List<RolUsuario> findAll() {
        List<RolUsuario> rolesUsuario = new ArrayList<>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from RolUsuario");
        rolesUsuario = query.list();
        tst.commit();
        return rolesUsuario;
    }

    //findById
    public RolUsuario findById(int id) {
        RolUsuario rolUsuario = new RolUsuario();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        rolUsuario = (RolUsuario) ss.get(RolUsuario.class, id);
        tst.commit();
        return rolUsuario;
    }

    //insert
    public void insert(RolUsuario rolUsuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(rolUsuario);
        ss.flush();
        tst.commit();
    }

    //update
    public void update(RolUsuario rolUsuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.update(rolUsuario);
        ss.flush();
        tst.commit();
    }

    //delete
    public void delete(RolUsuario rolUsuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.delete(rolUsuario);
        ss.flush();
        tst.commit();
    }
}
