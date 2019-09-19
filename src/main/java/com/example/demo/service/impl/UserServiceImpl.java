package com.example.demo.service.impl;

import com.example.demo.bean.User;
import com.example.demo.dao.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by XRom
 * On 11/16/2017.11:58 PM
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required=true)
    private UserRepository userRepository;

    @Override
    public void saveUser() {
        User user = new User();
        user.setName("XRog");
        userRepository.save(user);
    }
}
