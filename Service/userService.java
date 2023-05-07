package com.Harsh.EcommerceApplication.Service;

import com.Harsh.EcommerceApplication.Dao.UserDao;
import com.Harsh.EcommerceApplication.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public String createUser(List<User> user) {
        userDao.saveAll(user);
        return "User Created";
    }

    public List<User> getAllUser() {
        return userDao.findAll();
    }
}
