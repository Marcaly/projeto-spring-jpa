package com.marcaly.springcourse.repositories;

import com.marcaly.springcourse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
