package com.marcaly.springcourse.repositories;

import com.marcaly.springcourse.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
