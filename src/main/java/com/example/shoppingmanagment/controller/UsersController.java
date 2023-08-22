package com.example.shoppingmanagment.controller;

import com.example.shoppingmanagment.dto.request.UserRequest;
import com.example.shoppingmanagment.dto.response.UserResponse;
import com.example.shoppingmanagment.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
public class UsersController {

    final UserService userService;

    @GetMapping(value = "/usersList")
    public List<UserResponse> getUsersInfo() {
        return userService.getAll();
    }

    @GetMapping(value = "/getUserById/{id}")
    public UserResponse getUserById(@PathVariable(value = "id") Long id) {
        return userService.getUserById(id);
    }

    @PostMapping(value = "/saveUser")
    public void saveUser(@RequestBody UserRequest userRequest) {
        userService.saveUser(userRequest);
    }

    @PostMapping(value = "/updateUser")
    public void updateUser(@RequestBody UserRequest userRequest) {
        userService.updateUser(userRequest);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        userService.deleteById(id);
    }

}
