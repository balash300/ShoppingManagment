package com.example.shoppingmanagment.service.impl;

import com.example.shoppingmanagment.dto.response.CartItemResponse;
import com.example.shoppingmanagment.dto.request.CartItemRequest;
import com.example.shoppingmanagment.model.CartItem;
import com.example.shoppingmanagment.repository.CartItemRepository;
import com.example.shoppingmanagment.service.CartItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartItemImpl implements CartItemService {

    private final CartItemRepository cartItemRepository;

    @Override
    public CartItemResponse getCartItemById(Long id) {
        CartItem cartItem = cartItemRepository.getCartItemById(id);
        return CartItemResponse.builder()
                .quantity(cartItem.getQuantity())
                .createdAt(cartItem.getCreatedAt())
                .modifiedAt(cartItem.getModifiedAt())
                .build();
    }

    @Override
    public void saveCartItem(CartItemRequest cartItemRequest) {
        CartItem cartItem = CartItem.builder()
                .quantity(cartItemRequest.getQuantity())
                .createdAt((Date) cartItemRequest.getCreatedAt())
                .build();

        cartItemRepository.save(cartItem);
    }

    @Override
    public void updateCartItem(CartItemRequest cartItemRequest) {
        CartItem cartItem = CartItem.builder()
                .id(cartItemRequest.getId())
                .quantity(cartItemRequest.getQuantity())
                .modifiedAt((Date) cartItemRequest.getModifiedAt())
                .build();

        cartItemRepository.save(cartItem);
    }

    @Override
    public void deleteById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        } else {
            cartItemRepository.deleteById(id);
        }
    }

    @Override
    public List<CartItemResponse> getAll() {
        List<CartItem> cartItems = cartItemRepository.findAll();
        List<CartItemResponse> cartItemResponses = new ArrayList<>();

        for (CartItem cartItem : cartItems) {
            CartItemResponse cartItemResponse = CartItemResponse.builder()
                    .quantity(cartItem.getQuantity())
                    .createdAt(cartItem.getCreatedAt())
                    .modifiedAt(cartItem.getModifiedAt())
                    .build();

            cartItemResponses.add(cartItemResponse);
        }

        return cartItemResponses;
    }

}
