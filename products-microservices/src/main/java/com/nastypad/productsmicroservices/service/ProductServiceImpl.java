package com.nastypad.productsmicroservices.service;

import com.nastypad.productsmicroservices.domain.model.Product;
import com.nastypad.productsmicroservices.domain.repository.ProductRepository;
import com.nastypad.productsmicroservices.domain.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProduct(long id) {
        return productRepository.findProductById(id).orElseThrow();
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }
}
