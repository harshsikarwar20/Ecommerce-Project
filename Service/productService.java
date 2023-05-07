package com.Harsh.EcommerceApplication.Service;

import com.Harsh.EcommerceApplication.Dao.IProductDao;
import com.Harsh.EcommerceApplication.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductDao productDao;
    public String createProduct(List<Product> product) {
        productDao.saveAll(product);
        return "Product Created!!!";
    }
}
