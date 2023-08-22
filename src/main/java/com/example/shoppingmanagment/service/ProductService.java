package com.example.shoppingmanagment.service;

import com.example.shoppingmanagment.dto.request.ProductRequest;
import com.example.shoppingmanagment.dto.response.ProductResponse;

import java.util.List;

public interface ProductService {

    ProductResponse getProductById(Long id);

    void saveProduct(ProductRequest productRequest);

    void updateProduct(ProductRequest productRequest);

    void deleteById(Long id);

    List<ProductResponse> getAll();

}
