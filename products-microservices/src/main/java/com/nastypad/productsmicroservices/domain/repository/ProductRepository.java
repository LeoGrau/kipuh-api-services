package com.nastypad.productsmicroservices.domain.repository;

import com.nastypad.productsmicroservices.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findProductById(Long productId);
    List<Product> findAll();
}
