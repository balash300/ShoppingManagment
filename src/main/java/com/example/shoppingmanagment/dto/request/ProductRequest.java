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
public class ProductRequest {
    private Long id;
    private String name;
    private String desc;
    private String SKU;
    private String category;
    private BigDecimal price;
    private Date createdAt;
    private Date modifiedAt;
}
