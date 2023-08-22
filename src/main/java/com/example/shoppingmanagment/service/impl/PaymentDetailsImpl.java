package com.example.shoppingmanagment.service.impl;

import com.example.shoppingmanagment.dto.request.PaymentDetailsRequest;
import com.example.shoppingmanagment.dto.response.PaymentDetailsResponse;
import com.example.shoppingmanagment.model.PaymentDetails;
import com.example.shoppingmanagment.repository.PaymentDetailsRepository;
import com.example.shoppingmanagment.service.PaymentDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentDetailsImpl implements PaymentDetailsService {

    private final PaymentDetailsRepository paymentDetailsRepository;

    @Override
    public PaymentDetailsResponse getPaymentDetailsById(Long id) {
        PaymentDetails paymentDetails = paymentDetailsRepository.getPaymentDetailsById(id);
        return PaymentDetailsResponse.builder()
                .amount(paymentDetails.getAmount())
                .provider(paymentDetails.getProvider())
                .status(paymentDetails.getStatus())
                .createdAt(paymentDetails.getCreatedAt())
                .modifiedAt(paymentDetails.getModifiedAt())
                .build();
    }

    @Override
    public void savePaymentDetails(PaymentDetailsRequest paymentDetailsRequest) {
        PaymentDetails paymentDetails = PaymentDetails.builder()
                .amount(paymentDetailsRequest.getAmount())
                .provider(paymentDetailsRequest.getProvider())
                .status(paymentDetailsRequest.getStatus())
                .createdAt((Date) paymentDetailsRequest.getCreatedAt())
                .build();

        paymentDetailsRepository.save(paymentDetails);
    }

    @Override
    public void updatePaymentDetails(PaymentDetailsRequest paymentDetailsRequest) {
        PaymentDetails paymentDetails = PaymentDetails.builder()
                .id(paymentDetailsRequest.getId())
                .amount(paymentDetailsRequest.getAmount())
                .provider(paymentDetailsRequest.getProvider())
                .status(paymentDetailsRequest.getStatus())
                .modifiedAt((Date) paymentDetailsRequest.getModifiedAt())
                .build();

        paymentDetailsRepository.save(paymentDetails);
    }

    @Override
    public void deleteByid(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        } else {
            paymentDetailsRepository.deleteById(id);
        }
    }

    @Override
    public List<PaymentDetailsResponse> getAll() {
        List<PaymentDetails> paymentDetails = paymentDetailsRepository.findAll();
        List<PaymentDetailsResponse> paymentDetailsResponses = new ArrayList<>();

        for (PaymentDetails paymentDetail : paymentDetails) {
            PaymentDetailsResponse paymentDetailsResponse = PaymentDetailsResponse.builder()
                    .amount(paymentDetail.getAmount())
                    .provider(paymentDetail.getProvider())
                    .status(paymentDetail.getStatus())
                    .createdAt(paymentDetail.getCreatedAt())
                    .modifiedAt(paymentDetail.getModifiedAt())
                    .build();

            paymentDetailsResponses.add(paymentDetailsResponse);
        }

        return paymentDetailsResponses;
    }
}
