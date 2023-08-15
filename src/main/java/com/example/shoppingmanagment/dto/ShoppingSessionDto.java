package com.example.shoppingmanagment.dto;

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
public class ShoppingSessionDto {
    private BigDecimal total;
    private Date createdAt;
    private Date modifiedAt;
}
