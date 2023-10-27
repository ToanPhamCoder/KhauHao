package com.toan.microservice.ProductService.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private Environment env;

    @PostMapping
    public  String createProduct(){
        return "Create a new product";
    }

    @GetMapping
    public String getProduct(){
        return "Product" +env.getProperty("local.server.port");
    }

    @PutMapping
    public String updateProduct(){
        return "Update a product";
    }
    @DeleteMapping
    public String deleteProduct(){
        return "Delete a product";
    }
}
