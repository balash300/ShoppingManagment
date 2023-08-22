package com.example.shoppingmanagment.repository;

import com.example.shoppingmanagment.model.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItems, Long> {

    OrderItems getOrderItemsById(Long id);

}
