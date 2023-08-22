package com.example.shoppingmanagment.service.impl;

import com.example.shoppingmanagment.dto.request.ProductRequest;
import com.example.shoppingmanagment.dto.response.ProductResponse;
import com.example.shoppingmanagment.model.Product;
import com.example.shoppingmanagment.repository.ProductRepository;
import com.example.shoppingmanagment.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ProductResponse getProductById(Long id) {
        Product product = productRepository.getProductsById(id);
        return ProductResponse.builder()
                .name(product.getName())
                .desc(product.getDesc())
                .SKU(product.getSKU())
                .category(product.getCategory())
                .price(product.getPrice())
                .createdAt(product.getCreatedAt())
                .modifiedAt(product.getModifiedAt())
                .build();
    }

    @Override
    public void saveProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .desc(productRequest.getDesc())
                .SKU(productRequest.getSKU())
                .category(productRequest.getCategory())
                .price(productRequest.getPrice())
                .createdAt((Date) productRequest.getCreatedAt())
                .build();

        productRepository.save(product);
    }

    @Override
    public void updateProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .id(productRequest.getId())
                .name(productRequest.getName())
                .desc(productRequest.getDesc())
                .SKU(productRequest.getSKU())
                .category(productRequest.getCategory())
                .price(productRequest.getPrice())
                .modifiedAt((Date) productRequest.getModifiedAt())
                .build();

        productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        } else {
            productRepository.deleteById(id);
        }
    }

    @Override
    public List<ProductResponse> getAll() {
        List<Product> products = productRepository.findAll();
        List<ProductResponse> productResponses = new ArrayList<>();

        for (Product product: products) {
            ProductResponse productResponse = ProductResponse.builder()
                    .name(product.getName())
                    .desc(product.getDesc())
                    .SKU(product.getSKU())
                    .category(product.getCategory())
                    .price(product.getPrice())
                    .createdAt(product.getCreatedAt())
                    .modifiedAt(product.getModifiedAt())
                    .build();

            productResponses.add(productResponse);
        }

        return productResponses;
    }
}
