package com.nastypad.productsmicroservices.service;

import com.nastypad.productsmicroservices.domain.model.Product;
import com.nastypad.productsmicroservices.domain.repository.ProductRepository;
import com.nastypad.productsmicroservices.domain.service.ProductService;
import com.nastypad.productsmicroservices.resources.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final String entity = "Products";
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findProductById(id).orElseThrow(() -> new ResourceNotFoundException(entity, id));
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }
}
