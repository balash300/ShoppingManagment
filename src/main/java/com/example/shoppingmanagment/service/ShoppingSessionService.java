package com.example.shoppingmanagment.service;

import com.example.shoppingmanagment.dto.request.ShoppingSessionRequest;
import com.example.shoppingmanagment.dto.response.ShoppingSessionResponse;

import java.util.List;

public interface ShoppingSessionService {

    ShoppingSessionResponse getShoppingSessionById(Long id);

    void saveShoppingSession(ShoppingSessionRequest shoppingSessionRequest);

    void updateShoppingSession(ShoppingSessionRequest shoppingSessionRequest);

    void deleteById(Long id);

    List<ShoppingSessionResponse> getAll();
}
