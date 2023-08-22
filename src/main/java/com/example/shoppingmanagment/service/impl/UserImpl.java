package com.example.shoppingmanagment.service.impl;

import com.example.shoppingmanagment.dto.request.UserRequest;
import com.example.shoppingmanagment.dto.response.UserResponse;
import com.example.shoppingmanagment.model.Users;
import com.example.shoppingmanagment.repository.UserRepository;
import com.example.shoppingmanagment.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponse getUserById(Long id) {
        Users users = userRepository.getUserById(id);
        return UserResponse.builder()
                .username(users.getUsername())
                .firstName(users.getFirstName())
                .lastName(users.getLastName())
                .createdAt(users.getCreatedAt())
                .modifiedAt(users.getModifiedAt())
                .build();
    }

    @Override
    public void saveUser(UserRequest userRequest) {
        Users users = Users.builder()
                .username(userRequest.getUsername())
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .createdAt((Date) userRequest.getCreatedAt())
                .build();

        userRepository.save(users);
    }

    @Override
    public void updateUser(UserRequest userRequest) {
        Users users = Users.builder()
                .id(userRequest.getId())
                .username(userRequest.getUsername())
                .password(userRequest.getPassword())
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .address(userRequest.getAddress())
                .telephone(userRequest.getTelephone())
                .modifiedAt((Date) userRequest.getModifiedAt())
                .build();

        userRepository.save(users);
    }

    @Override
    public void deleteById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        } else {
            userRepository.deleteById(id);
        }
    }

    @Override
    public List<UserResponse> getAll() {
        List<Users> users = userRepository.findAll();
        List<UserResponse> userResponses = new ArrayList<>();

        for (Users user: users) {
            UserResponse userResponse = UserResponse.builder()
                    .username(user.getUsername())
                    .firstName(user.getFirstName())
                    .lastName(user.getLastName())
                    .createdAt(user.getCreatedAt())
                    .modifiedAt(user.getModifiedAt())
                    .build();

            userResponses.add(userResponse);
        }

        return userResponses;
    }
}
