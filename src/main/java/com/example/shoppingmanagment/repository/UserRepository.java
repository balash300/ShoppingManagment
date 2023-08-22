package com.example.shoppingmanagment.repository;

import com.example.shoppingmanagment.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    Users getUserById(Long id);

}
