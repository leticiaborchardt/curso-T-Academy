package com.example.aula.primeiroprojeto.controllers;

import com.example.aula.primeiroprojeto.dtos.ProductRecordDTO;
import com.example.aula.primeiroprojeto.models.ProductModel;
import com.example.aula.primeiroprojeto.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<ProductModel>> getAllProducts() {
        return ResponseEntity.status(HttpStatus.OK).body(productRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getProductById(@PathVariable(value = "id") UUID id) {
        Optional<ProductModel> productO = productRepository.findById(id);

        if (productO.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(productO.get());
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found.");
    }

    @PostMapping
    public ResponseEntity<ProductModel> createProduct(@RequestBody @Valid ProductRecordDTO productDTO) {
        ProductModel productModel = new ProductModel();
        BeanUtils.copyProperties(productDTO, productModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModel));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateProduct(@PathVariable(value = "id") UUID id, @RequestBody @Valid ProductRecordDTO productDTO) {
        Optional<ProductModel> productO = productRepository.findById(id);

        if (productO.isPresent()) {
            var productModel = productO.get();
            BeanUtils.copyProperties(productDTO, productModel);

            return ResponseEntity.status(HttpStatus.OK).body(productRepository.save(productModel));
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable(value = "id") UUID id) {
        Optional<ProductModel> productO = productRepository.findById(id);

        if (productO.isPresent()) {
            productRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Product deleted successfully.");
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found.");
    }
}
