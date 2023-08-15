package com.example.shoppingmanagment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CurrentTimestamp;

import java.sql.Date;

@Entity
@Data
@Builder
@Table(name = "payment_details")
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "order_id")
    private Long orderID;
    private Long amount;
    private String provider;
    private String status;
    @Column(name = "created_at")
    @CurrentTimestamp
    private Date createdAt;
    @Column(name = "modified_at")
    @CurrentTimestamp
    private Date modifiedAt;

}
