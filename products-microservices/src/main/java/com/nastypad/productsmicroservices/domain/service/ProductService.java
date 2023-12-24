package com.nastypad.productsmicroservices.domain.service;

import com.nastypad.productsmicroservices.domain.model.Product;

import java.util.List;

public interface ProductService {
    Product getProduct(long id);
    List<Product> getProducts();
}
