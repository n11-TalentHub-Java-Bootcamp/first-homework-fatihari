package com.fatihari.homework1;

import java.util.List;

import com.fatihari.homework1.dao.CategoryDAO;
import com.fatihari.homework1.entity.Category;
import com.fatihari.homework1.entity.Product;
import com.fatihari.homework1.service.CategoryService;
import com.fatihari.homework1.service.ProductService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CategoryService service = new CategoryService();
    	List<Category> categoryList = service.findAll();
    	
    	for (Category category : categoryList) {
    		System.out.println(category);
    	}
    }
}
