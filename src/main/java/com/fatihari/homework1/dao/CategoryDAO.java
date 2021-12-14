package com.fatihari.homework1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.fatihari.homework1.base.BaseDAO;
import com.fatihari.homework1.entity.Category;
import com.fatihari.homework1.hibernate.HibernateUtil;

public class CategoryDAO extends BaseDAO implements ICategoryDAO
{	
	public CategoryDAO() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	
	public List<Category> findAll()
	{
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("SELECT category FROM Category AS category");
		return query.list();
	}

	@Override
	public Category findById(Long categoryId) 
	{
        String sql = "SELECT category FROM Category AS category WHERE category.id = : categoryId";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("categoryId", categoryId);

        return (Category) query.uniqueResult();
	}
}
