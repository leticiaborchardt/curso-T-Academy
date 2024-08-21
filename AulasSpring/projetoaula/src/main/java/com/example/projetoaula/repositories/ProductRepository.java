package com.example.projetoaula.repositories;

import com.example.projetoaula.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {

    List<Product> findByCategoryIgnoreCase(String category);
    List<Product> findByPriceBetween(Double minPrice, Double maxPrice);
    List<Product> findByNameContainingIgnoreCase(String name);
}
