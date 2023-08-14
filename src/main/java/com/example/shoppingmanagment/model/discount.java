package com.example.shoppingmanagment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Data
@Builder
@Table(name = "discount")
@NoArgsConstructor
@AllArgsConstructor
public class discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", columnDefinition = "varchar(max)")
    private String name;
    @Column(name = "desc", columnDefinition = "TEXT")
    private String desc;
    @Column(name = "discount_percent", precision = 5, scale = 4)
    private BigDecimal similarity;
    @Column(name = "created_at")
    @CurrentTimestamp
    private Date createdAt;
    @Column(name = "modified_at")
    @CurrentTimestamp
    private Date modifiedAt;

}
