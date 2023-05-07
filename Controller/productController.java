package com.Harsh.EcommerceApplication.Controller;

import com.Harsh.EcommerceApplication.Model.Product;
import com.Harsh.EcommerceApplication.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping(value="/product")
    public String createProduct(@RequestBody List<Product> product){
        return productService.createProduct(product);
    }
}
