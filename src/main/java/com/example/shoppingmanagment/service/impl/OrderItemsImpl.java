package com.example.shoppingmanagment.service.impl;

import com.example.shoppingmanagment.dto.request.OrderDetailsRequest;
import com.example.shoppingmanagment.dto.request.OrderItemsRequest;
import com.example.shoppingmanagment.dto.response.OrderItemsResponse;
import com.example.shoppingmanagment.model.OrderItems;
import com.example.shoppingmanagment.repository.OrderItemsRepository;
import com.example.shoppingmanagment.service.OrderItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderItemsImpl implements OrderItemsService {

    private final OrderItemsRepository orderItemsRepository;

    @Override
    public OrderItemsResponse getOrderItemsById(Long id) {
        OrderItems orderItems = orderItemsRepository.getOrderItemsById(id);
        return OrderItemsResponse.builder()
                .createdAt(orderItems.getCreatedAt())
                .modifiedAt(orderItems.getModifiedAt())
                .build();
    }

    @Override
    public void saveOrderItems(OrderItemsRequest orderItemsRequest) {
        OrderItems orderItems = OrderItems.builder()
                .createdAt((Date) orderItemsRequest.getCreatedAt())
                .build();

        orderItemsRepository.save(orderItems);
    }

    @Override
    public void updateOrderItems(OrderItemsRequest orderItemsRequest) {
        OrderItems orderItems = OrderItems.builder()
                .id(orderItemsRequest.getId())
                .modifiedAt((Date) orderItemsRequest.getModifiedAt())
                .build();

        orderItemsRepository.save(orderItems);
    }

    @Override
    public void deleteById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        } else {
            orderItemsRepository.deleteById(id);
        }
    }

    @Override
    public List<OrderItemsResponse> getAll() {
        List<OrderItems> orderItems = orderItemsRepository.findAll();
        List<OrderItemsResponse> orderItemsResponses = new ArrayList<>();

        for (int i = 0; i < orderItems.size(); i++) {
            OrderItemsResponse orderItemsResponse = OrderItemsResponse.builder()
                    .createdAt(orderItems.get(i).getCreatedAt())
                    .modifiedAt(orderItems.get(i).getModifiedAt())
                    .build();

            orderItemsResponses.add(orderItemsResponse);
        }
        return orderItemsResponses;
    }
}
