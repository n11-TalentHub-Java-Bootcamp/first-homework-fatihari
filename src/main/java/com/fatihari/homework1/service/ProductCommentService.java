package com.fatihari.homework1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatihari.homework1.dao.IProductCommentDAO;
import com.fatihari.homework1.dao.ProductCommentDAO;
import com.fatihari.homework1.dto.AllCommentsOfAProductDTO;
import com.fatihari.homework1.dto.AllCommentsOfAUserDTO;
import com.fatihari.homework1.dto.CommentCountsOfAllProductsDTO;

@Service
public class ProductCommentService implements IProductCommentService
{
	@Autowired
	private IProductCommentDAO iProductCommentDAO;
	
	@Autowired
	public ProductCommentService() 
	{
		this.iProductCommentDAO = new ProductCommentDAO();
	}
	
	@Override
	public List<AllCommentsOfAProductDTO> findAllCommentsOfAProductDTO(Long productId) 
	{
		return this.iProductCommentDAO.findAllCommentsOfAProductDTO(productId);
	}

	@Override
	public List<CommentCountsOfAllProductsDTO> findCommentCountsOfAllProductsDTO() 
	{
		return this.iProductCommentDAO.findCommentCountsOfAllProductsDTO();
	}

	@Override
	public List<AllCommentsOfAUserDTO> findAllCommentsOfAUserDTO(Long userId) 
	{
		return this.iProductCommentDAO.findAllCommentsOfAUserDTO(userId);
	}

}
