package com.example.shoppingmanagment.repository;

import com.example.shoppingmanagment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User getUsersById(Long id);

}
