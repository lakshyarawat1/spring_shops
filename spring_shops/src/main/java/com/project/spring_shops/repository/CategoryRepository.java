package com.project.spring_shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.spring_shops.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
