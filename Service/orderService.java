package com.Harsh.EcommerceApplication.Service;

import com.Harsh.EcommerceApplication.Dao.IAddressDao;
import com.Harsh.EcommerceApplication.Dao.IOrderDao;
import com.Harsh.EcommerceApplication.Dao.IProductDao;
import com.Harsh.EcommerceApplication.Dao.UserDao;
import com.Harsh.EcommerceApplication.Model.Address;
import com.Harsh.EcommerceApplication.Model.Order;
import com.Harsh.EcommerceApplication.Model.Product;
import com.Harsh.EcommerceApplication.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    IOrderDao orderDao;

    @Autowired
    UserDao userDao;

    @Autowired
    IProductDao orderProduct;

    @Autowired
    IAddressDao orderAddress;

    public String createOrder(Order order, Integer userId, Integer productId, Integer addressId) {
        String result = null;

        if(userDao.existsById(userId)){
            List<Order> orderList = orderDao.findAll();
            for(Order oldOrder : orderList){
                if(oldOrder.getUser().getUserId().equals(userId) && oldOrder.getProduct().getProductId().equals(productId) && oldOrder.getAddress().getAddressId().equals(addressId)){
                    return " ";
                }
            }
            User userNewOrder = userDao.findById(userId).get();
            Product userNewProduct = orderProduct.findById(productId).get();
            Address userAddress = orderAddress.findById(addressId).get();

            //Set New Order
            order.setUser(userNewOrder);
            order.setProduct(userNewProduct);
            order.setAddress(userAddress);

            //save New Order
            orderDao.save(order);

            result = order.getUser().getUserName();
        }
        return result;
    }
}
