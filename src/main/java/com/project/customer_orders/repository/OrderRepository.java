package com.project.customer_orders.repository;

import com.project.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Surendiran P M
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
