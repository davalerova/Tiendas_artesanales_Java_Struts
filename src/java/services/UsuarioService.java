/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import model.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author daval
 */
public class UsuarioService {

    //findAll
    public List<Usuario> findAll() {
        List<Usuario> usuarios = new ArrayList<>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from Usuario");
        usuarios = query.list();
        tst.commit();
        return usuarios;
    }
    
    public Usuario findByNombres(String desc) {
        Usuario usuario = new Usuario();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("from Usuario where nombres =:desc");
        query.setParameter("desc", desc);
        usuario = (Usuario) query.uniqueResult();
        tst.commit();
        return usuario;
    }

    //findById
    public Usuario findById(int id) {
        Usuario usuario = new Usuario();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        usuario = (Usuario) ss.get(Usuario.class, id);
        tst.commit();
        return usuario;
    }
    
    public Usuario findByNumeroDocumentoIdentidad(String numDocIdent) {
        Usuario usr = new Usuario();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("FROM Usuario U WHERE U.numeroDocumentoIdentidad =:numDocIdent");
        query.setParameter("numDocIdent", numDocIdent);
        usr = (Usuario) query.uniqueResult();
        tst.commit();
        ss.close();
        return usr;
    }
    

    public Usuario findByNickname(String nickname) {
        Usuario usr = new Usuario();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        Query query = ss.createQuery("FROM Usuario U WHERE U.nickname = :nickname");
        query.setParameter("nickname", nickname);
        usr = (Usuario) query.uniqueResult();
        tst.commit();
        ss.close();
        return usr;
    }

    //insert
    public void insert(Usuario usuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.save(usuario);
        ss.flush();
        tst.commit();
    }

    //update
    public void update(Usuario usuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.update(usuario);
        ss.flush();
        tst.commit();
    }

    //delete
    public void delete(Usuario usuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tst = ss.beginTransaction();
        ss.delete(usuario);
        ss.flush();
        tst.commit();
    }
}
