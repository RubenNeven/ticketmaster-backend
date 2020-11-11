package com.ticketmaster.backend.controller;

import com.ticketmaster.backend.controller.dto.user.UserDto;
import com.ticketmaster.backend.controller.dto.user.UserDtoList;
import com.ticketmaster.backend.controller.mapper.user.UserMapper;
import com.ticketmaster.backend.entity.user.User;
import com.ticketmaster.backend.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/api")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @Autowired
    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/users")
    public ResponseEntity<UserDtoList> getAllUsers(){
        List<User> userList = userService.findAllUsers();
        List<UserDto> userDtoList = userList.stream().map(userMapper::map).collect(Collectors.toList());
        UserDtoList users = userMapper.mapToUserDtoList(userDtoList);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(users);
    }
}
