package com.fatihari.homework1.application;

import java.util.List;

import com.fatihari.homework1.dto.AllCommentsOfAUserDTO;
import com.fatihari.homework1.service.ProductCommentService;

//Script files have been added under the "resource" folder. 
public class TaskFourApp 
{
	public static void main(String[] args) 
	{		
		ProductCommentService productCommentService = new ProductCommentService();
		List<AllCommentsOfAUserDTO> dtos = productCommentService.findAllCommentsOfAUserDTO(1L);
		
		for (AllCommentsOfAUserDTO dto : dtos) 
		{
			System.out.println(dto);
		}
	}
}
