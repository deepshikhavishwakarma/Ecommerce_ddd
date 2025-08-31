package com.hcl.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.main.model.Category;
@Service
public interface CategoryService {
	public Boolean existCategory(String name);
	public Category saveCategory(Category category);

	public List<Category> getAllCategory();
	public Boolean deleteCategory(int id);
}
