package com.nastypad.productsmicroservices.rest.api;

import com.nastypad.productsmicroservices.resources.Response;
import com.nastypad.productsmicroservices.resources.show.ProductResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
    public ProductsController() {
    }

    @GetMapping("/info")
    public Response getInfo() {
        return new Response("Products controller for creating, reading, update and deleting products.");
    }
}

