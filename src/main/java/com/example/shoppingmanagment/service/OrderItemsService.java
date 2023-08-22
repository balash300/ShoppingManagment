package com.example.shoppingmanagment.service;

import com.example.shoppingmanagment.dto.request.OrderDetailsRequest;
import com.example.shoppingmanagment.dto.request.OrderItemsRequest;
import com.example.shoppingmanagment.dto.response.OrderItemsResponse;
import com.example.shoppingmanagment.model.OrderItems;

import java.util.List;

public interface OrderItemsService {

    OrderItemsResponse getOrderItemsById(Long id);

    void saveOrderItems(OrderItemsRequest orderItemsRequest);

    void updateOrderItems(OrderItemsRequest orderItemsRequest);

    void deleteById(Long id);

    List<OrderItemsResponse> getAll();
}
