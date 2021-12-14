package com.fatihari.homework1.application;

import com.fatihari.homework1.entity.Product;
import com.fatihari.homework1.service.ProductService;

public class FindByIdApp {

	public static void main(String[] args) 
	{
    	ProductService productService = new ProductService();
    	Product product = productService.findById(1L);
		System.out.println(product);
	}

}
