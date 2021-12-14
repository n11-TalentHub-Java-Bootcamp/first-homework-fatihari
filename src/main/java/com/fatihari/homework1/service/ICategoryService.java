package com.fatihari.homework1.service;

import java.util.List;
import com.fatihari.homework1.entity.Category;

public interface ICategoryService 
{
	public List<Category> findAll();
	public Category findById(Long categoryId);
	
}
