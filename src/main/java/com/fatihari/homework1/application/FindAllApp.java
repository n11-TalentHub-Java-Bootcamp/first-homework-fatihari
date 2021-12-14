package com.fatihari.homework1.application;

import java.util.List;

import com.fatihari.homework1.entity.Product;
import com.fatihari.homework1.service.ProductService;


public class FindAllApp {

	public static void main(String[] args) 
	{
		ProductService productService = new ProductService();
    	List<Product> productList = productService.findAll();
    	
    	for (Product product : productList) {
			System.out.println(product);
		}
	}

}
