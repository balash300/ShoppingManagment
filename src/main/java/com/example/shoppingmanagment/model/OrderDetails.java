package com.example.shoppingmanagment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CurrentTimestamp;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Data
@Builder
@Table(name = "order_details")
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "user_id")
    private String userID;
    @Column(name = "total", precision = 5, scale = 4)
    private BigDecimal total;
    @Column(name = "payment_id")
    private Long paymentID;
    @Column(name = "created_at")
    @CurrentTimestamp
    private Date createdAt;
    @Column(name = "modified_at")
    @CurrentTimestamp
    private Date modifiedAt;
}
