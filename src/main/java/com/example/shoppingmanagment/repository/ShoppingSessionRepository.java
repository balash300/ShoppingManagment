package com.example.shoppingmanagment.repository;

import com.example.shoppingmanagment.model.ShoppingSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingSessionRepository extends JpaRepository<ShoppingSession, Long> {

    ShoppingSession getShoppingSessionById(Long id);

}
