package com.practice2.practice2.repository;

import com.practice2.practice2.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
