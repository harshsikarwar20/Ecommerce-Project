package com.Harsh.EcommerceApplication.Dao;

import com.Harsh.EcommerceApplication.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDao extends JpaRepository<Product,Integer> {
}
