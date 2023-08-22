package com.example.shoppingmanagment.service;

import com.example.shoppingmanagment.dto.response.DiscountResponse;
import com.example.shoppingmanagment.dto.request.DiscountRequest;

import java.util.List;

public interface DiscountService {

    DiscountResponse getDiscountById(Long id);

    void saveDiscount(DiscountRequest discountRequest);

    void updateDiscount(DiscountRequest discountRequest);

    void deleteById(Long id);

    List<DiscountResponse> getAll();

}
