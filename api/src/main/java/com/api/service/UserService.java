package com.api.service;

import com.api.entity.UserAddress;

import java.util.List;

public interface UserService {

    List<UserAddress> getAddress(String userId);

}
