package com.example.shoppingmanagment.controller;

import com.example.shoppingmanagment.dto.request.OrderItemsRequest;
import com.example.shoppingmanagment.dto.response.OrderItemsResponse;
import com.example.shoppingmanagment.service.OrderItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/orderItems")
public class OrderItemsController {

    final OrderItemsService orderItemsService;

    @GetMapping(value = "/orderItemsList")
    public List<OrderItemsResponse> getOrderItemsInfo() {
        return orderItemsService.getAll();
    }

    @GetMapping(value = "/getOrderItemsById/{id}")
    public OrderItemsResponse getOrderItemsById(@PathVariable(value = "id") Long id) {
        return orderItemsService.getOrderItemsById(id);
    }

    @PostMapping(value = "/saveOrderItems")
    public void saveOrderItems(@RequestBody OrderItemsRequest orderItemsRequest) {
        orderItemsService.saveOrderItems(orderItemsRequest);
    }

    @PostMapping(value = "/updateOrderItems")
    public void updateOrderItems(@RequestBody OrderItemsRequest orderItemsRequest) {
        orderItemsService.updateOrderItems(orderItemsRequest);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteByid(@PathVariable(value = "id") Long id) {
        orderItemsService.deleteById(id);
    }

}
