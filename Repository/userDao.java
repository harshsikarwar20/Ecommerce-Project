package com.Harsh.EcommerceApplication.Dao;

import com.Harsh.EcommerceApplication.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
}
