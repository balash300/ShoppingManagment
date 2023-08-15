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
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String username;
    @Column(name = "text", columnDefinition = "TEXT")
    private String password;
    @Column(name = "first_name", precision = 5, scale = 4)
    private BigDecimal firstName;
    @Column(name = "last_name")
    private String lastName;
    private String address;
    private Long telephone;
    @Column(name = "created_at")
    @CurrentTimestamp
    private Date createdAt;
    @Column(name = "modified_at")
    @CurrentTimestamp
    private Date modifiedAt;
}
