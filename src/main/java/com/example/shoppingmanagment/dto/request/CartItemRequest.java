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
public class CartItemRequest {
    private Long id;
    private Long sessionID;
    private Long productID;
    private Long quantity;
    private Date createdAt;
    private Date modifiedAt;
}
