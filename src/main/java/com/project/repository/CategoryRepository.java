package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{
	CategoryEntity findOneByCode(String code);
}
