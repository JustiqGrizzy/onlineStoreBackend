package com.digital.onlinestorebackend.service;

import com.digital.onlinestorebackend.entity.Product;
import com.digital.onlinestorebackend.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public List<Product> displayProducts() {
        return productRepo.findAll();
    }

    public List<Product> displayCategoryProducts(Long id) {
        return productRepo.findAllByCategoryId(id);
    }
    public List<Product> displaySearchProducts(String query) {return productRepo.searchProducts(query);}
}
