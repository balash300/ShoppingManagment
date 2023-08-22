package com.example.shoppingmanagment.controller;

import com.example.shoppingmanagment.dto.request.PaymentDetailsRequest;
import com.example.shoppingmanagment.dto.response.PaymentDetailsResponse;
import com.example.shoppingmanagment.service.PaymentDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/paymentDetails")
public class PaymentDetailsController {

    final PaymentDetailsService paymentDetailsService;

    @GetMapping(value = "/paymentDetailsList")
    public List<PaymentDetailsResponse> getPaymentDetailsInfo() {
        return paymentDetailsService.getAll();
    }

    @GetMapping(value = "/getPaymentDetailsById/{id}")
    public PaymentDetailsResponse getPaymentDetailsById(@PathVariable(value = "id") Long id) {
        return paymentDetailsService.getPaymentDetailsById(id);
    }

    @PostMapping(value = "/savePaymentDetails")
    public void savePaymentDetails(@RequestBody PaymentDetailsRequest paymentDetailsRequest) {
        paymentDetailsService.savePaymentDetails(paymentDetailsRequest);
    }

    @PostMapping(value = "/updatePaymentDetails")
    public void updatePaymentDetails(@RequestBody PaymentDetailsRequest paymentDetailsRequest) {
        paymentDetailsService.updatePaymentDetails(paymentDetailsRequest);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        paymentDetailsService.deleteByid(id);
    }


}
