package org.example.ecommerceapp.map;

import org.example.ecommerceapp.dto.user.CreateUserRequest;
import org.example.ecommerceapp.dto.user.UserResponese;
import org.example.ecommerceapp.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserResponese toUserResponese (User user);

    User toUser (CreateUserRequest createUserRequest);

}
