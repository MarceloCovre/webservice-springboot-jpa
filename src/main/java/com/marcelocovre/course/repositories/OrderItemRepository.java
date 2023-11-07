package com.marcelocovre.course.repositories;

import com.marcelocovre.course.entities.OrderItem;
import com.marcelocovre.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
