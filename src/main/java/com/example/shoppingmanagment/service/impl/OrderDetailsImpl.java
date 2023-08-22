package com.example.shoppingmanagment.service.impl;

import com.example.shoppingmanagment.dto.request.OrderDetailsRequest;
import com.example.shoppingmanagment.dto.response.OrderDetailsResponse;
import com.example.shoppingmanagment.model.OrderDetails;
import com.example.shoppingmanagment.repository.OrderDetailsRepository;
import com.example.shoppingmanagment.service.OrderDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderDetailsImpl implements OrderDetailsService {

    private final OrderDetailsRepository orderDetailsRepository;

    @Override
    public OrderDetailsResponse getOrderDetailsById(Long id) {
        OrderDetails orderDetails = orderDetailsRepository.getOrderDetailsById(id);
        return OrderDetailsResponse.builder()
                .total(orderDetails.getTotal())
                .createdAt(orderDetails.getCreatedAt())
                .modifiedAt(orderDetails.getModifiedAt())
                .build();
    }

    @Override
    public void saveOrderDetails(OrderDetailsRequest orderDetailsRequest) {
        OrderDetails orderDetails = OrderDetails.builder()
                .total(orderDetailsRequest.getTotal())
                .createdAt((Date) orderDetailsRequest.getCreatedAt())
                .build();

        orderDetailsRepository.save(orderDetails);
    }

    @Override
    public void updateOrderDetails(OrderDetailsRequest orderDetailsRequest) {
        OrderDetails orderDetails = OrderDetails.builder()
                .id(orderDetailsRequest.getId())
                .total(orderDetailsRequest.getTotal())
                .modifiedAt((Date) orderDetailsRequest.getModifiedAt())
                .build();

        orderDetailsRepository.save(orderDetails);
    }

    @Override
    public void deleteById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        } else {
            orderDetailsRepository.deleteById(id);
        }
    }

    @Override
    public List<OrderDetailsResponse> getAll() {
        List<OrderDetails> orderDetails = orderDetailsRepository.findAll();
        List<OrderDetailsResponse> orderDetailsResponses = new ArrayList<>();

        for (OrderDetails orderDetail : orderDetails) {
            OrderDetailsResponse orderDetailsResponse = OrderDetailsResponse.builder()
                    .total(orderDetail.getTotal())
                    .createdAt(orderDetail.getCreatedAt())
                    .modifiedAt(orderDetail.getModifiedAt())
                    .build();

            orderDetailsResponses.add(orderDetailsResponse);
        }

        return orderDetailsResponses;
    }
}
