package com.example.shoppingmanagment.service;

import com.example.shoppingmanagment.dto.request.UserRequest;
import com.example.shoppingmanagment.dto.response.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse getUserById(Long id);

    void saveUser(UserRequest userRequest);

    void updateUser(UserRequest userRequest);

    void deleteById(Long id);

    List<UserResponse> getAll();
}
