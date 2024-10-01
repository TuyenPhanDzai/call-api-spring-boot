package org.example.ecommerceapp.config;

import org.example.ecommerceapp.map.UserMapper;
import org.mapstruct.ap.internal.model.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserMapper userMapper() { return Mappers.getMapper(UserMapper.class); }

}
