package com.nastypad.productsmicroservices.configuration.mappers;

import com.nastypad.productsmicroservices.domain.model.Product;
import com.nastypad.productsmicroservices.resources.show.ProductResource;

import java.util.List;

public class ProductMapper {
    EnhancedModelMapper enhancedModelMapper;
    public ProductResource toResource(Product productModel) {
        return enhancedModelMapper.map(productModel, ProductResource.class);
    }
    public List<ProductResource> toListResource(List<Product> listProductModel) {
        return enhancedModelMapper.mapList(listProductModel, ProductResource.class);
    }
}
