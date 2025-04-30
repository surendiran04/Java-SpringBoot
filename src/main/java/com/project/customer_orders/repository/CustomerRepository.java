package com.project.customer_orders.repository;

import com.project.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Surendiran M
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
