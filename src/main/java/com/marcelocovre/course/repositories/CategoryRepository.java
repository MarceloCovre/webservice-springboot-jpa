package com.marcelocovre.course.repositories;

import com.marcelocovre.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
