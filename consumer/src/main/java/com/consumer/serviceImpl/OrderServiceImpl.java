package com.consumer.serviceImpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.api.entity.UserAddress;
import com.api.service.OrderService;
import com.api.service.UserService;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;
    @Override
    public List<UserAddress> initOrder(String id) {
        List<UserAddress> list = userService.getAddress(id);
        for(UserAddress u:list){
            System.out.println(u.getUserAddress());
        }
        return list;
    }
}
