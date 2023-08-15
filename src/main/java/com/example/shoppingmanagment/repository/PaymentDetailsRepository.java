package com.example.shoppingmanagment.repository;

import com.example.shoppingmanagment.model.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails, Long> {

    PaymentDetails getPaymentDetailsById(Long id);

}
