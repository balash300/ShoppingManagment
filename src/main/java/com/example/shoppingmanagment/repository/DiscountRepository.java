package com.example.shoppingmanagment.repository;

import com.example.shoppingmanagment.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount, Long> {

    Discount getDiscountById(Long id);

}
