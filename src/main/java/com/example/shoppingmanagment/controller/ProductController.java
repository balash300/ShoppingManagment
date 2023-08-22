package com.example.shoppingmanagment.controller;

import com.example.shoppingmanagment.dto.request.ProductRequest;
import com.example.shoppingmanagment.dto.response.ProductResponse;
import com.example.shoppingmanagment.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/product")
public class ProductController {

    final ProductService productService;

    @GetMapping(value = "/productList")
    public List<ProductResponse> getProductInfo() {
        return productService.getAll();
    }

    @GetMapping(value = "/getProductById/{id}")
    public ProductResponse getProductById(@PathVariable(value = "id") Long id) {
        return productService.getProductById(id);
    }

    @PostMapping(value = "/saveProduct")
    public void saveProduct(@RequestBody ProductRequest productRequest) {
        productService.saveProduct(productRequest);
    }

    @PostMapping(value = "/updateProduct")
    public void updateProduct(@RequestBody ProductRequest productRequest) {
        productService.updateProduct(productRequest);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        productService.deleteById(id);
    }

}
