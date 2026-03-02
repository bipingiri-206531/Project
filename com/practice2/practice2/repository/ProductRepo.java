package com.practice2.practice2.repository;

import com.practice2.practice2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
