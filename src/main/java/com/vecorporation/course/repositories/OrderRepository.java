package com.vecorporation.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vecorporation.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
