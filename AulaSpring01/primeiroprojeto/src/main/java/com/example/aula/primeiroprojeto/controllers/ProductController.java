package com.example.aula.primeiroprojeto.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping
    public ResponseEntity getAllProducts() {
        return ResponseEntity.ok("Funcionou");
    }

    @DeleteMapping
    public ResponseEntity deleteProductById(@RequestParam int id) {
        return ResponseEntity.ok("Funcionou");
    }
}
