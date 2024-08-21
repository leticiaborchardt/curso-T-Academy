package com.example.projetoaula.specifications;

import com.example.projetoaula.models.Product;
import org.springframework.data.jpa.domain.Specification;

public class ProductSpecification {
    public static Specification<Product> hasCategory(String category) {
        return (root, query, cb) ->
                category == null
                        ? null
                        : cb.like(cb.lower(root.get("category")), "%" + category.toLowerCase() + "%");
    }

    public static Specification<Product> nameContains(String name) {
        return (root, query, cb) ->
                name == null
                        ? null
                        : cb.like(cb.lower(root.get("name")), "%" + name.toLowerCase() + "%");
    }

    public static Specification<Product> hasPriceRange(Double minPrice, Double maxPrice) {
        return ((root, query, cb) -> {
            if (minPrice != null && maxPrice != null) {
                return cb.between(root.get("price"), minPrice, maxPrice);
            } else if (minPrice != null) {
                return cb.greaterThanOrEqualTo(root.get("price"), minPrice);
            } else if (maxPrice != null) {
                return cb.lessThanOrEqualTo(root.get("price"), maxPrice);
            } else {
                return null;
            }
        });
    }
}
