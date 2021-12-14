package com.fatihari.homework1.application;

import java.util.List;

import com.fatihari.homework1.dto.AllCommentsOfAProductDTO;
import com.fatihari.homework1.service.ProductCommentService;

//Script files have been added under the "resource" folder. 

public class TaskTwoApp 
{
	public static void main(String[] args) 
	{	
		ProductCommentService productCommentService = new ProductCommentService();
		List<AllCommentsOfAProductDTO> dtos = productCommentService.findAllCommentsOfAProductDTO(3L);
		
		for (AllCommentsOfAProductDTO dto : dtos) 
		{
			System.out.println(dto);
		}
	}
}
