package com.digital.onlinestorebackend.repo;

import com.digital.onlinestorebackend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findAllByCategoryId(Long id);

    @Query("SELECT p FROM Product p WHERE " +
            "LOWER(p.model) LIKE LOWER(CONCAT('%',:query, '%'))" +
            "Or LOWER(p.brand) LIKE LOWER(CONCAT('%', :query, '%'))" +
            "Or LOWER(p.category.name) LIKE LOWER(CONCAT('%', :query, '%'))")
    List<Product> searchProducts(String query);


}
