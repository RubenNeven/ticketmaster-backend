package com.ticketmaster.backend.controller.mapper.user;

import com.ticketmaster.backend.controller.dto.user.UserDto;
import com.ticketmaster.backend.controller.dto.user.UserDtoList;
import com.ticketmaster.backend.entity.user.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    public UserDto map(User user){
        return UserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
    }

    public UserDtoList mapToUserDtoList(List<UserDto> userList){
        return UserDtoList.builder().users(userList.stream().collect(Collectors.toList())).build();
    }
}
