package com.fatihari.homework1.application;

import java.util.List;

import com.fatihari.homework1.dto.ProductDetailDTO;
import com.fatihari.homework1.service.ProductService;

public class DtoApp {

	public static void main(String[] args) 
	{
		ProductService productService = new ProductService();
		List<ProductDetailDTO> dtos = productService.findAllProductDetailDtoByCategoryRefractive(3L);
		
		for (ProductDetailDTO dto : dtos) 
		{
			System.out.println(dto);
		}

	}

}
