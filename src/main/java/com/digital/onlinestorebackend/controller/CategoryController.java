package com.digital.onlinestorebackend.controller;

import com.digital.onlinestorebackend.entity.Category;
import com.digital.onlinestorebackend.service.CategoryService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Data
@RequiredArgsConstructor
@CrossOrigin
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> displayCategories(){
        return categoryService.displayCategories();
    }
}
