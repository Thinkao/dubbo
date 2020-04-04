package com.provider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.api.entity.UserAddress;
import com.api.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getAddress(String userId) {
        UserAddress u1 = new UserAddress();
        u1.setId(1);
        u1.setUserAddress("TianJin");
        u1.setUserId("001");
        UserAddress u2 = new UserAddress();
        u2.setId(2);
        u2.setUserAddress("Peking");
        u2.setUserId("002");

        return Arrays.asList(u1,u2);
    }
}
