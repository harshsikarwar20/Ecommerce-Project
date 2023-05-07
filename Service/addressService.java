package com.Shrishti.EcommerceApplication.Service;

import com.Harsh.EcommerceApplication.Dao.IAddressDao;
import com.Harsh.EcommerceApplication.Dao.UserDao;
import com.Harsh.EcommerceApplication.Model.Address;
import com.Harsh.EcommerceApplication.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressDao addressDao;

    @Autowired
    UserDao userDao;
    public String createAddress(Address address, Integer userId) {
        String result = null;
        if(userDao.existsById(userId)){
            List<Address> addressList = addressDao.findAll();
            for(Address oldAddress : addressList){
                if(oldAddress.getUser().getUserId().equals(userId)){
                    return " ";
                }
            }
            User presentUser = userDao.findById(userId).get();
            address.setUser(presentUser);
            addressDao.save(address);
            result = address.getAddressName();
        }
        return result;
    }
}
