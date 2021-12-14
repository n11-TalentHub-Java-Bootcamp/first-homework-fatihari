package com.fatihari.homework1.application;

import java.math.BigDecimal;
import java.util.List;

import com.fatihari.homework1.entity.Product;
import com.fatihari.homework1.service.ProductService;

public class FindGeLeApp 
{
	public static void main(String[] args) 
	{
		ProductService productService = new ProductService();
		List<Product> productList = productService.findAllProductListByPrice(BigDecimal.valueOf(100), BigDecimal.valueOf(1000));
		
		for (Product product : productList) {
			System.out.println(product);
		}
		
	}

}
