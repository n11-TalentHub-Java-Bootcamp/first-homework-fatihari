package com.fatihari.homework1.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fatihari.homework1.entity.Category;
import com.fatihari.homework1.entity.Product;
import com.fatihari.homework1.hibernate.HibernateUtil;

public class BaseDAO 
{
	protected SessionFactory sessionFactory;

    public BaseDAO() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    protected Session getCurrentSession(){

        Session session = sessionFactory.openSession();

        return session;
    }
}
