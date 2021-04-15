/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import model.TipoDocumentoIdentidad;
import model.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author daval
 */
public class TipoDocumentoIdentidadService {

    //findAll
    public List<TipoDocumentoIdentidad> findAll() {
        List<TipoDocumentoIdentidad> tipoDocumentosIdentidad = new ArrayList<>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from TipoDocumentoIdentidad");
        tipoDocumentosIdentidad = query.list();
        tst.commit();
        return tipoDocumentosIdentidad;
    }

    //findById
    public TipoDocumentoIdentidad findById(int id) {
        TipoDocumentoIdentidad tipoDocumentoIdentidad = new TipoDocumentoIdentidad();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        tipoDocumentoIdentidad = (TipoDocumentoIdentidad) ss.get(TipoDocumentoIdentidad.class, id);
        tst.commit();
        return tipoDocumentoIdentidad;
    }

    //insert
    public void insert(TipoDocumentoIdentidad tipoDocumentoIdentidad) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(tipoDocumentoIdentidad);
        ss.flush();
        tst.commit();
    }

    //update
    public void update(TipoDocumentoIdentidad tipoDocumentoIdentidad) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.update(tipoDocumentoIdentidad);
        ss.flush();
        tst.commit();
    }

    //delete
    public void delete(TipoDocumentoIdentidad tipoDocumentoIdentidad) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.delete(tipoDocumentoIdentidad);
        ss.flush();
        tst.commit();
    }
}
