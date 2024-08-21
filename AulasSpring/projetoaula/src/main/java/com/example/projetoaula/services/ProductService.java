package com.example.projetoaula.services;

import com.example.projetoaula.models.Product;
import com.example.projetoaula.repositories.ProductRepository;
import com.example.projetoaula.specifications.ProductSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // FORMA DE FAZER USANDO FUNÇÕES ESPECÍFICAS
//    public List<Product> getProductsByCategory(String category) {
//        return productRepository.findByCategoryIgnoreCase(category);
//    }
//
//    public List<Product> getProductsByPriceRange(Double minPrice, Double maxPrice) {
//        return productRepository.findByPriceBetween(minPrice, maxPrice);
//    }
//
//    public List<Product> getProductsByName(String name) {
//        return productRepository.findByNameContainingIgnoreCase(name);
//    }
//
//    public List<Product> filterProducts(String category, Double minPrice, Double maxPrice, String name) {
//        List<Product> products = getAllProducts();
//
//        if (category != null) {
//            products.retainAll(getProductsByCategory(category));
//        }
//
//        if (minPrice != null && maxPrice != null) {
//            products.retainAll(getProductsByPriceRange(minPrice, maxPrice));
//        }
//
//        if (name != null) {
//            products.retainAll(getProductsByName(name));
//        }
//
//        return products;
//    }


    // FORMA DE FAZER USANDO STREAM E FILTERS
//    public List<Product> getAllProducts(String category, Double minPrice, Double maxPrice, String name) {
//        List<Product> products = productRepository.findAll();
//
//
//        if (category != null) {
//            products.retainAll(products.stream().filter(product -> product.getCategory().contains(category)).collect(Collectors.toList()));
//        }
//        if (minPrice != null && maxPrice != null) {
//            products.retainAll(products.stream()
//                    .filter(product -> product.getPrice() >= minPrice && product.getPrice() <= maxPrice).collect(Collectors.toList()));
//        }
//        if (name != null) {
//            products.retainAll(products.stream().filter(product -> product.getName().contains(name)).collect(Collectors.toList()));
//        }
//        return products;
//    }


    // FORMA DE FAZER USANDO SPECIFICATIONS
    public List<Product> getAllProducts(String category, Double minPrice, Double maxPrice, String name) {
        Specification<Product> spec = Specification
                .where(ProductSpecification.hasCategory(category))
                .and(ProductSpecification.hasPriceRange(minPrice, maxPrice))
                .and(ProductSpecification.nameContains(name));

        return productRepository.findAll(spec);
    }
}
