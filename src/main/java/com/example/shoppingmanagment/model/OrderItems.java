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
@Table(name = "order_items")
@NoArgsConstructor
@AllArgsConstructor
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "order_id")
    private Long orderID;
    @Column(name = "product_id")
    private Long productID;
    @Column(name = "created_at")
    @CurrentTimestamp
    private Date createdAt;
    @Column(name = "modified_at")
    @CurrentTimestamp
    private Date modifiedAt;

}
