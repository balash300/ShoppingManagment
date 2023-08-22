package com.example.shoppingmanagment.service;

import com.example.shoppingmanagment.dto.request.OrderDetailsRequest;
import com.example.shoppingmanagment.dto.response.OrderDetailsResponse;

import java.util.List;

public interface OrderDetailsService {

    OrderDetailsResponse getOrderDetailsById(Long id);

    void saveOrderDetails(OrderDetailsRequest orderDetailsRequest);

    void updateOrderDetails(OrderDetailsRequest orderDetailsRequest);

    void deleteById(Long id);

    List<OrderDetailsResponse> getAll();

}
