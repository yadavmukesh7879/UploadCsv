package com.javatechie.spring.batch.repository;

import com.javatechie.spring.batch.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Products,Integer> {
}
