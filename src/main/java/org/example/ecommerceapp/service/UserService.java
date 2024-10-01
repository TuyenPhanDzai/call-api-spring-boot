package org.example.ecommerceapp.service;

import org.example.ecommerceapp.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User getUserById(String id);
    User createUser(User user);
    User updateUser(User user);

}
