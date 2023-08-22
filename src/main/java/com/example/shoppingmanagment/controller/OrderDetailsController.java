package com.example.shoppingmanagment.controller;

import com.example.shoppingmanagment.dto.request.OrderDetailsRequest;
import com.example.shoppingmanagment.dto.response.OrderDetailsResponse;
import com.example.shoppingmanagment.service.OrderDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/orderDetails")
public class OrderDetailsController {

    final OrderDetailsService orderDetailsService;

    @GetMapping(value = "/orderDetailsList")
    public List<OrderDetailsResponse> getOrderDetailsInfo() {
        return orderDetailsService.getAll();
    }

    @GetMapping(value = "/getOrderDetailsById/{id}")
    public OrderDetailsResponse getOrderDetailsById(@PathVariable(value = "id") Long id) {
        return orderDetailsService.getOrderDetailsById(id);
    }

    @PostMapping(value = "/saveOrderDetails")
    public void saveOrderDetails(@RequestBody OrderDetailsRequest orderDetailsRequest) {
        orderDetailsService.saveOrderDetails(orderDetailsRequest);
    }

    @PostMapping(value = "/updateOrderDetails")
    public void updateOrderDetails(@RequestBody OrderDetailsRequest orderDetailsRequest) {
        orderDetailsService.updateOrderDetails(orderDetailsRequest);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        orderDetailsService.deleteById(id);
    }

}
