/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daos;

//import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jboss.logging.Logger;
import org.jboss.logging.Logger.Level;

/**
 *
 * @author samarth
 */
public class DAO {
   // private static final Logger log = Logger.getAnonymousLogger();
    private static final ThreadLocal localsession = new ThreadLocal();
    //Configuration cfg =new Configuration();
    private static final  SessionFactory sessionFactory = new Configuration().addAnnotatedClass(com.mycompany.models.Student.class)
            .configure("hibernate.cfg.xml")
            .buildSessionFactory();
  
     private boolean isAnnotation ;
     
    /* public DAO(boolean isAnnotationFlag ) {
    if(isAnnotationFlag == true)
    {
        SessionFactory factory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
        sessionFactory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
    }
    } */
    protected DAO() {
    }
    
    public static Session getSession() {
        Session session = (Session) DAO.localsession.get();
        if (session == null) {
            session = sessionFactory.openSession();
            DAO.localsession.set(session);
        }
        return session;
    }
    
    protected void beginTransaction() {
        getSession().beginTransaction();
    }

    protected void commit() {
        getSession().getTransaction().commit();
    }
    
    protected void rollback() {
        try {
            getSession().getTransaction().rollback();
        } catch (HibernateException e) {
           // log.log(Level.WARNING, "Cannot rollback", e);
        }

        try {
            getSession().close();
        } catch (HibernateException e) {
           // log.log(Level.WARNING, "Cannot close", e);
        }
        DAO.localsession.set(null);
    }
    
    public static void close() {
        getSession().close();
        DAO.localsession.set(null);
    }
    

}
