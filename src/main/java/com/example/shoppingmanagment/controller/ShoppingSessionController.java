package com.example.shoppingmanagment.controller;

import com.example.shoppingmanagment.dto.request.ShoppingSessionRequest;
import com.example.shoppingmanagment.dto.response.ShoppingSessionResponse;
import com.example.shoppingmanagment.service.ShoppingSessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/shoppingSession")
public class ShoppingSessionController {

    final ShoppingSessionService shoppingSessionService;

    @GetMapping(value = "/shoppingSessionList")
    public List<ShoppingSessionResponse> getShoppingSessionInfo() {
        return shoppingSessionService.getAll();
    }

    @GetMapping(value = "/getShoppingSessionById/{id}")
    public ShoppingSessionResponse getShoppingSessionById(@PathVariable(value = "id") Long id) {
        return shoppingSessionService.getShoppingSessionById(id);
    }

    @PostMapping(value = "/saveShoppingSession")
    public void saveShoppingSession(@RequestBody ShoppingSessionRequest shoppingSessionRequest) {
        shoppingSessionService.saveShoppingSession(shoppingSessionRequest);
    }

    @PostMapping(value = "/updateShoppingSession")
    public void updateShoppingSession(@RequestBody ShoppingSessionRequest shoppingSessionRequest) {
        shoppingSessionService.updateShoppingSession(shoppingSessionRequest);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        shoppingSessionService.deleteById(id);
    }
}
