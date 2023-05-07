package com.Harsh.EcommerceApplication.Dao;

import com.Harsh.EcommerceApplication.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressDao extends JpaRepository<Address,Integer> {
}
