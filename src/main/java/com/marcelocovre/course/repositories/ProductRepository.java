package com.marcelocovre.course.repositories;

import com.marcelocovre.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
