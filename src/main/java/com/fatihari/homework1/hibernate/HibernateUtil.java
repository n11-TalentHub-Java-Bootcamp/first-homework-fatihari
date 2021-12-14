package com.fatihari.homework1.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fatihari.homework1.entity.Category;
import com.fatihari.homework1.entity.Product;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

        try {
            Configuration cfg = new Configuration();

            cfg.addAnnotatedClass(Category.class);
            cfg.addAnnotatedClass(Product.class);

            SessionFactory sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();

            return sessionFactory;

        } catch (Exception e){
            System.out.println("Session factory oluşturulurken hata oluştu" + e);
            throw new ExceptionInInitializerError(e);
        }

    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
