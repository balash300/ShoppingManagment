package com.example.shoppingmanagment.repository;

import com.example.shoppingmanagment.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    CartItem getCartItemById(Long id);

}
