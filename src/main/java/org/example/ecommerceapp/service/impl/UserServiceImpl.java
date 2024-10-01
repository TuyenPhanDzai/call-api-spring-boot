package org.example.ecommerceapp.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.ecommerceapp.model.User;
import org.example.ecommerceapp.repository.UserRepository;
import org.example.ecommerceapp.service.UserService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
