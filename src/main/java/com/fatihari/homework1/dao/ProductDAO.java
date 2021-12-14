 package com.fatihari.homework1.dao;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.fatihari.homework1.base.BaseDAO;
import com.fatihari.homework1.dto.ProductDetailDTO;
import com.fatihari.homework1.entity.Product;
import com.fatihari.homework1.hibernate.HibernateUtil;

public class ProductDAO extends BaseDAO implements IProductDAO
{	
	public ProductDAO() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	public List<Product> findAll()
	{
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("SELECT product FROM Product AS product");
		return query.list();
	}
    public Product findById(Long productId)
    {
    	//  "SELECT product" includes all columns, means (*). Instead of "product" you can use "product.id" (lists only the id column), 
    	//   COUNT(product), MAX(product.price), AVG, MIN etc. 
        String sql = "SELECT product FROM Product AS product WHERE product.id = : productId"; 
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("productId", productId);

        return (Product)query.uniqueResult();
    }
    @Override
    public List<Product> findAllProductListByPrice(BigDecimal priceGe, BigDecimal priceLe) 
    {
    	String sql = "SELECT product FROM Product AS product WHERE 1=1 ";
    	
    	if(priceGe != null)
    		sql = sql + " AND product.price >= :priceGe";
    	if(priceLe != null)
    		sql = sql + " AND product.price <= :priceLe";
    	
    	Query query = getCurrentSession().createQuery(sql);
    	query.setParameter("priceGe", priceGe);
    	query.setParameter("priceLe", priceLe);
    	return query.list();
    }
	@Override
	public List<Product> findAllProductListByPriceBetween(BigDecimal priceGe, BigDecimal priceLe) 
	{
		String sql = "SELECT product FROM Product AS product WHERE 1=1 ";
		
		if(priceGe != null && priceLe != null)
			sql = sql + " AND product.price BETWEEN : priceGe AND :priceLe";
		
		Query query = getCurrentSession().createQuery(sql);
		query.setParameter("priceGe", priceGe);
		query.setParameter("priceLe", priceLe);
		return query.list();
	}
	@Override
	public List<Product> findAllProductByCategoryRefractive(Long refractive) 
	{
		String sql = "SELECT product FROM Product AS product LEFT JOIN Category AS category ON product.category.id = category.id WHERE category.refractive = :refractive";
		Query query = getCurrentSession().createQuery(sql);
		query.setParameter("refractive", refractive);
		return query.list();
	}
	@Override
	public List<ProductDetailDTO> findAllProductDetailDtoByCategoryRefractive(Long refractive) 
	{
		String sql = "SELECT new com.fatihari.homework1.dto.ProductDetailDTO(product.name, category.name, product.price) " + 
				     "FROM Product AS product LEFT JOIN Category AS category " + 
				     "ON product.category.id = category.id " +
				     "WHERE category.refractive = :refractive";
		
    	Query query = getCurrentSession().createQuery(sql);
    	query.setParameter("refractive", refractive);
    	return query.list();
	}

}
