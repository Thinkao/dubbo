package com.api.service;

import com.api.entity.UserAddress;

import java.util.List;

public interface OrderService {

    List<UserAddress> initOrder(String id);

}
