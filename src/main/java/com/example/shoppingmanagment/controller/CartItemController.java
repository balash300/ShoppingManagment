package com.example.shoppingmanagment.controller;

import com.example.shoppingmanagment.dto.request.CartItemRequest;
import com.example.shoppingmanagment.dto.response.CartItemResponse;
import com.example.shoppingmanagment.service.CartItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/cartItem")
public class CartItemController {

    final CartItemService cartItemService;

    @GetMapping(value = "/cartItemList")
    public List<CartItemResponse> getCartItemInfo() {
        return cartItemService.getAll();
    }

    @GetMapping(value = "/getCartItemById/{id}")
    public CartItemResponse getCartItemById(@PathVariable(value = "id") Long id) {
        return getCartItemById(id);
    }

    @PostMapping(value = "/saveCartItem")
    public void saveCartItem(@RequestBody CartItemRequest cartItemRequest) {
        cartItemService.saveCartItem(cartItemRequest);
    }

    @PostMapping(value = "/updateCartItem")
    public void updateCartItem(@RequestBody CartItemRequest cartItemRequest) {
        cartItemService.updateCartItem(cartItemRequest);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        cartItemService.deleteById(id);
    }
}
