package com.example.demo.controllers;


import com.example.demo.domain.dtos.CategoryDto;
import com.example.demo.domain.entities.Category;
import com.example.demo.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {


    private final CategoryService categoryService;


    @GetMapping
    public ResponseEntity<List<CategoryDto>> listCategories(){
        List<Category> categoriesEntity = categoryService.listCategories();

    }



}
