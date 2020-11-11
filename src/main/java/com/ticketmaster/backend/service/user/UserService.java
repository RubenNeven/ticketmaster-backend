package com.ticketmaster.backend.service.user;

import com.ticketmaster.backend.entity.user.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();
}
