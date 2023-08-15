package com.example.shoppingmanagment.repository;

import com.example.shoppingmanagment.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product getProductsById(Long id);

}
