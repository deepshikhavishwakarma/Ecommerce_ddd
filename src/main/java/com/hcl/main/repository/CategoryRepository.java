package com.hcl.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.main.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
public Boolean existsByName(String name);
}
