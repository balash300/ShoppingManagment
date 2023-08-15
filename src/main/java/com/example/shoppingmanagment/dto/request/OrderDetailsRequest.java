package com.example.shoppingmanagment.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailsRequest {
    private Long id;
    private String userID;
    private BigDecimal total;
    private Long paymentID;
    private Date createdAt;
    private Date modifiedAt;
}

