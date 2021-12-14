package com.fatihari.homework1.application;

import java.util.List;

import com.fatihari.homework1.entity.Product;
import com.fatihari.homework1.service.ProductService;

public class JoinApp {

	public static void main(String[] args) 
	{
		ProductService productService = new ProductService();
		List<Product> prodList = productService.findAllProductByCategoryRefractive(3L);
		
		for (Product product : prodList) 
		{
			System.out.println(product);
		}

	}

}
