package com.example.shoppingmanagment.repository;

import com.example.shoppingmanagment.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {

    OrderDetails getOrderDetailsById(Long id);

}
