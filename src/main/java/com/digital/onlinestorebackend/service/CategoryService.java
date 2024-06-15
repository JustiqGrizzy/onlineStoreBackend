package com.digital.onlinestorebackend.service;

import com.digital.onlinestorebackend.entity.Category;
import com.digital.onlinestorebackend.repo.CategoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepo categoryRepo;

    public List<Category> displayCategories(){
        return categoryRepo.findAll();
    }
}
