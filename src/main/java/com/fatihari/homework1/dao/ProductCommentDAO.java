package com.fatihari.homework1.dao;

import java.util.List;

import org.hibernate.query.Query;

import com.fatihari.homework1.base.BaseDAO;
import com.fatihari.homework1.dto.AllCommentsOfAProductDTO;
import com.fatihari.homework1.dto.AllCommentsOfAUserDTO;
import com.fatihari.homework1.dto.CommentCountsOfAllProductsDTO;

/* In order to avoid confusion, the names of the applications are given as "TaskTwoApp", "TaskThreeApp", "TaskFourApp". */

public class ProductCommentDAO extends BaseDAO implements IProductCommentDAO { // Interface and abstract structures were used. 

	/* Application class to run: TaskTwoApp */
	
	@Override
	public List<AllCommentsOfAProductDTO> findAllCommentsOfAProductDTO(Long productId) 
	{
		String sql = "SELECT new com.fatihari.homework1.dto.AllCommentsOfAProductDTO(product.name, category.name, " +
					 "product.price, user_account.first_name, user_account.last_name, user_account.email, user_account.phone, "+ 
					 "product_comment.comment_text, product_comment.comment_date) FROM " + 
					 "UserAccount AS user_account " + 
					 "LEFT JOIN ProductComment AS product_comment ON user_account.id = product_comment.user_account.id " +
				     "LEFT JOIN Product AS product ON product_comment.product.id = product.id " + 
					 "LEFT JOIN Category AS category ON product.category.id = category.id " + 
					 "WHERE product.id = :productId";
	
		Query query = getCurrentSession().createQuery(sql);
		
		query.setParameter("productId", productId); //	To view the comments of a particular product, it is necessary to take that product's id as a parameter.
		return query.list();
	}

	@Override
	public List<CommentCountsOfAllProductsDTO> findCommentCountsOfAllProductsDTO() 
	{	
		/* Application class to run: TaskThreeApp */
		
		String sql = "SELECT new com.fatihari.homework1.dto.CommentCountsOfAllProductsDTO(product.id, product.name, " +
					 "product.price, COUNT(product_comment)) FROM " +
					 "Product AS product LEFT JOIN ProductComment AS product_comment " +  // If Normal Join or Right Join was done, products without comments would not be listed! :)
					 "ON product_comment.product.id = product.id " +
					 "GROUP BY product.id " +
					 "ORDER BY COUNT(product_comment) DESC"; // Optionally, the result is sorted in descending order of comments using "ORDER BY".
					 
		Query query = getCurrentSession().createQuery(sql);
		return query.list();
	}
	
	/* Application class to run: TaskFourApp */
	@Override
	public List<AllCommentsOfAUserDTO> findAllCommentsOfAUserDTO(Long userId) 
	{	
		String sql = "SELECT new com.fatihari.homework1.dto.AllCommentsOfAUserDTO(user_account.id, " +
					 "user_account.first_name, user_account.last_name, product.name, product_comment.comment_text, " +
					 "product_comment.comment_date) FROM UserAccount AS user_account " + 
					 "JOIN ProductComment AS product_comment ON user_account.id = product_comment.user_account.id " + // Normal Join is used instead of Left Join, as no result is desired for the user who has no comments.
				     "LEFT JOIN Product AS product ON product_comment.product.id = product.id " + 
				     "WHERE user_account.id = :userId";
		
		Query query = getCurrentSession().createQuery(sql);
		query.setParameter("userId", userId); 		//	To view the comments of a particular user, it is necessary to take that user's id as a parameter.
		return query.list();
	}
}
