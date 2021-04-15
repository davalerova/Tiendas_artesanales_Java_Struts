/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import model.EstadoAprobacionRolUsuario;
import model.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author daval
 */
public class EstadoAprobacionRolUsuarioService {

    //findAll
    public List<EstadoAprobacionRolUsuario> findAll() {
        List<EstadoAprobacionRolUsuario> estadoAprobacionRolUsuarios = new ArrayList<>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from EstadoAprobacionRolUsuario");
        estadoAprobacionRolUsuarios = query.list();
        tst.commit();
        return estadoAprobacionRolUsuarios;
    }

    //findById
    public EstadoAprobacionRolUsuario findById(int id) {
        EstadoAprobacionRolUsuario estadoAprobacionRolUsuario = new EstadoAprobacionRolUsuario();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        estadoAprobacionRolUsuario = (EstadoAprobacionRolUsuario) ss.get(EstadoAprobacionRolUsuario.class, id);
        tst.commit();
        return estadoAprobacionRolUsuario;
    }

    //insert
    public void insert(EstadoAprobacionRolUsuario estadoAprobacionRolUsuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(estadoAprobacionRolUsuario);
        ss.flush();
        tst.commit();
    }

    //update
    public void update(EstadoAprobacionRolUsuario estadoAprobacionRolUsuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.update(estadoAprobacionRolUsuario);
        ss.flush();
        tst.commit();
    }

    //delete
    public void delete(EstadoAprobacionRolUsuario estadoAprobacionRolUsuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.delete(estadoAprobacionRolUsuario);
        ss.flush();
        tst.commit();
    }
}
