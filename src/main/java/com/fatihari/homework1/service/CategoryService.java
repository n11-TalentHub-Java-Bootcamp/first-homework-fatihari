package com.fatihari.homework1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fatihari.homework1.dao.CategoryDAO;
import com.fatihari.homework1.dao.ICategoryDAO;
import com.fatihari.homework1.entity.Category;

@Service
public class CategoryService implements ICategoryService
{	
	@Autowired
	private ICategoryDAO iCategoryDAO; 
		
	@Autowired
	public CategoryService() {
		this.iCategoryDAO = new CategoryDAO();
	}

	@Override
	public List<Category> findAll() {
		return this.iCategoryDAO.findAll();
	}

	@Override
	public Category findById(Long categoryId) {
		return this.iCategoryDAO.findById(categoryId);
	}

}
