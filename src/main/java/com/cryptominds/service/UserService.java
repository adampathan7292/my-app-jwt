package com.cryptominds.service;

import java.util.List;

import com.cryptominds.model.User;

public interface UserService {

    User save(User user);
    List<User> findAllProfiles();
    User findOne(String username);
    User findById(Integer id);
}
