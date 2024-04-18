package com.springproject.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.springcourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
