package com.nastypad.salesmicroservice.api;

import com.nastypad.productsmicroservices.resources.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {
    public SalesController() {
    }

    @GetMapping("/info")
    public Response getInfo() {
        return new Response("Products controller for creating, reading, update and deleting products.");
    }
}

