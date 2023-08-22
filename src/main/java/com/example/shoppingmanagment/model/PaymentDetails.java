package com.example.shoppingmanagment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CurrentTimestamp;

import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@Builder
@Table(name = "payment_details")
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private Long amount;
    private String provider;
    private String status;
    @Column(name = "created_at")
    @CurrentTimestamp
    private Date createdAt;
    @Column(name = "modified_at")
    @CurrentTimestamp
    private Date modifiedAt;

    @OneToOne(mappedBy = "paymentDetails", cascade = CascadeType.ALL, orphanRemoval = true)
    private OrderDetails orderDetails;

}
