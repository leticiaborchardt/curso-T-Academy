package com.example.aula.primeiroprojeto.controllers;

import com.example.aula.primeiroprojeto.dtos.CategoryRecordDto;
import com.example.aula.primeiroprojeto.models.CategoryModel;
import com.example.aula.primeiroprojeto.repositories.CategoryRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping
    public ResponseEntity<List<CategoryModel>> getAllCategories() {
        return ResponseEntity.status(HttpStatus.OK).body(categoryRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getCategoryById(@PathVariable(value = "id") UUID id) {
        CategoryModel category = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));

        return ResponseEntity.status(HttpStatus.OK).body(category);
    }

    @PostMapping
    public ResponseEntity<CategoryModel> createCategory(@RequestBody @Valid CategoryRecordDto categoryDTO) {
        CategoryModel categoryModel = new CategoryModel();
        BeanUtils.copyProperties(categoryDTO, categoryModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(categoryRepository.save(categoryModel));
    }
}
