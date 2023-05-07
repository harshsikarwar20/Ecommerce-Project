package com.Harsh.EcommerceApplication.Dao;

import com.Harsh.EcommerceApplication.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderDao extends JpaRepository<Order,Integer> {
}
