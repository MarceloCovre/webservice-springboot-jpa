package com.marcelocovre.course.repositories;

import com.marcelocovre.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
