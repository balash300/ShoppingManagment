package com.example.shoppingmanagment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name = "order_items")
@NoArgsConstructor
@AllArgsConstructor
public class orderItems {
}
