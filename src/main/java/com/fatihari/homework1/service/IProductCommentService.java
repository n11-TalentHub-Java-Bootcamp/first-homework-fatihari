package com.fatihari.homework1.service;

import java.util.List;

import com.fatihari.homework1.dto.AllCommentsOfAProductDTO;
import com.fatihari.homework1.dto.AllCommentsOfAUserDTO;
import com.fatihari.homework1.dto.CommentCountsOfAllProductsDTO;

public interface IProductCommentService 
{
	public List<AllCommentsOfAProductDTO> findAllCommentsOfAProductDTO(Long productId);
	public List<CommentCountsOfAllProductsDTO> findCommentCountsOfAllProductsDTO();
	public List<AllCommentsOfAUserDTO> findAllCommentsOfAUserDTO(Long userId);
}
