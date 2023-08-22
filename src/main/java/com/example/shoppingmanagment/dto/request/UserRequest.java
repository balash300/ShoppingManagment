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
public class UserRequest {
    private Long id;
    private String username;
    private String password;
    private BigDecimal firstName;
    private String lastName;
    private String address;
    private Long telephone;
    private Date createdAt;
    private Date modifiedAt;
}
