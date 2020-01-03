package com.ngconsulting.api.mapper;

import com.ngconsulting.api.domain.UserDto;
import com.ngconsulting.api.entity.UserEntity;

public class UserMapper {

    public static UserDto entityToUserDto(UserEntity entity){

        UserDto dto = new UserDto();
        dto.setAge(entity.getAge());
        dto.setId(entity.getId());
        dto.setEmail(entity.getEmail());
        dto.setName(entity.getName());
        dto.setPicture(entity.getPicture());
        dto.setDateConnexion(entity.getDateConnexion());
        dto.setDateCreation(entity.getDateCreation());
        return dto;
    }
}
