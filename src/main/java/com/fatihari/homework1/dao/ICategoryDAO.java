package com.fatihari.homework1.dao;

import java.util.List;
import com.fatihari.homework1.entity.Category;

public interface ICategoryDAO 
{
	public List<Category> findAll();
	public Category findById(Long categoryId);
}
