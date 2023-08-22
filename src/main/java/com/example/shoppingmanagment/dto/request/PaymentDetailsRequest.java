package com.example.shoppingmanagment.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetailsRequest {
    private Long id;
    private Long amount;
    private String provider;
    private String status;
    private Date createdAt;
    private Date modifiedAt;
}
