package com.example.shoppingmanagment.service;

import com.example.shoppingmanagment.dto.request.PaymentDetailsRequest;
import com.example.shoppingmanagment.dto.response.PaymentDetailsResponse;

import java.util.List;

public interface PaymentDetailsService {

    PaymentDetailsResponse getPaymentDetailsById(Long id);

    void savePaymentDetails(PaymentDetailsRequest paymentDetailsRequest);

    void updatePaymentDetails(PaymentDetailsRequest paymentDetailsRequest);

    void deleteByid(Long id);

    List<PaymentDetailsResponse> getAll();
}
