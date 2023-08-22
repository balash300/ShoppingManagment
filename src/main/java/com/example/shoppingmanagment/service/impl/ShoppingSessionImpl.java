package com.example.shoppingmanagment.service.impl;

import com.example.shoppingmanagment.dto.request.ShoppingSessionRequest;
import com.example.shoppingmanagment.dto.response.ShoppingSessionResponse;
import com.example.shoppingmanagment.model.ShoppingSession;
import com.example.shoppingmanagment.repository.ShoppingSessionRepository;
import com.example.shoppingmanagment.service.ShoppingSessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ShoppingSessionImpl implements ShoppingSessionService {

    private final ShoppingSessionRepository repository;

    @Override
    public ShoppingSessionResponse getShoppingSessionById(Long id) {
        ShoppingSession shoppingSession = repository.getShoppingSessionById(id);
        return ShoppingSessionResponse.builder()
                .total(shoppingSession.getTotal())
                .createdAt(shoppingSession.getCreatedAt())
                .modifiedAt(shoppingSession.getModifiedAt())
                .build();
    }

    @Override
    public void saveShoppingSession(ShoppingSessionRequest shoppingSessionRequest) {
        ShoppingSession shoppingSession = ShoppingSession.builder()
                .total(shoppingSessionRequest.getTotal())
                .createdAt((Date) shoppingSessionRequest.getCreatedAt())
                .build();

        repository.save(shoppingSession);
    }

    @Override
    public void updateShoppingSession(ShoppingSessionRequest shoppingSessionRequest) {
        ShoppingSession shoppingSession = ShoppingSession.builder()
                .id(shoppingSessionRequest.getId())
                .total(shoppingSessionRequest.getTotal())
                .modifiedAt((Date) shoppingSessionRequest.getModifiedAt())
                .build();

        repository.save(shoppingSession);
    }

    @Override
    public void deleteById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        } else {
            repository.deleteById(id);
        }
    }

    @Override
    public List<ShoppingSessionResponse> getAll() {
        List<ShoppingSession> shoppingSessions = repository.findAll();
        List<ShoppingSessionResponse> responses = new ArrayList<>();

        for (ShoppingSession shoppingSession: shoppingSessions) {
            ShoppingSessionResponse response = ShoppingSessionResponse.builder()
                    .total(shoppingSession.getTotal())
                    .createdAt(shoppingSession.getCreatedAt())
                    .modifiedAt(shoppingSession.getModifiedAt())
                    .build();

            responses.add(response);
        }
        return responses;
    }
}
