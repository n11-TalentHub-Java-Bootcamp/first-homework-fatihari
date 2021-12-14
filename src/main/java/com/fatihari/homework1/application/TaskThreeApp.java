package com.fatihari.homework1.application;

import java.util.List;

import com.fatihari.homework1.dto.CommentCountsOfAllProductsDTO;
import com.fatihari.homework1.service.ProductCommentService;

//Script files have been added under the "resource" folder. 

public class TaskThreeApp 
{
	public static void main(String[] args) 
	{
		ProductCommentService productCommentService = new ProductCommentService();
		List<CommentCountsOfAllProductsDTO> dtos = productCommentService.findCommentCountsOfAllProductsDTO();
		
		for (CommentCountsOfAllProductsDTO dto : dtos) 
		{
			System.out.println(dto);
		}
	}
}
