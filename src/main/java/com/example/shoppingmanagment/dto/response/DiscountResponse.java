package com.example.shoppingmanagment.dto.response;

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
public class DiscountResponse {
    private String name;
    private String desc;
    private BigDecimal discountPercent;
    private Date createdAt;
    private Date modifiedAt;
}
