package com.example.shoppingmanagment.service;

import com.example.shoppingmanagment.dto.response.CartItemResponse;
import com.example.shoppingmanagment.dto.request.CartItemRequest;

import java.util.List;

public interface CartItemService {

    CartItemResponse getCartItemById(Long id);

    void saveCartItem(CartItemRequest cartItemRequest);

    void updateCartItem(CartItemRequest cartItemRequest);

    void deleteById(Long id);

    List<CartItemResponse> getAll();

}
