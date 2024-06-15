package com.digital.onlinestorebackend.controller;

import com.digital.onlinestorebackend.entity.Product;
import com.digital.onlinestorebackend.service.ProductService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequiredArgsConstructor
@CrossOrigin
public class ProductController {
    private final ProductService productService;

    @GetMapping("/all-products")
    public List<Product> displayProducts() {
        return productService.displayProducts();
    }

    @GetMapping("/{categoryId}")
    public List<Product> displayCategoryProducts(@PathVariable("categoryId") Long id) {
        return productService.displayCategoryProducts(id);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> displaySearchProducts(@RequestParam("query") String query) {
        return ResponseEntity.ok(productService.displaySearchProducts(query));
    }
}
