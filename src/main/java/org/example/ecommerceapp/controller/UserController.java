package org.example.ecommerceapp.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.ecommerceapp.dto.user.CreateUserRequest;
import org.example.ecommerceapp.dto.user.UserResponese;
import org.example.ecommerceapp.map.UserMapper;
import org.example.ecommerceapp.model.User;
import org.example.ecommerceapp.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {

        User user = userService.getUserById(id);

//        if (user == null) {
//            return ResponseEntity.notFound().build();
//        }

        return (user);

    }

    @PostMapping("/create")
    public ResponseEntity<UserResponese> createUser(@RequestBody @Valid CreateUserRequest createUserRequest) {

        User user = userService.createUser(userMapper.toUser(createUserRequest));

        return ResponseEntity.ok(userMapper.toUserResponese(user));

    }

}
