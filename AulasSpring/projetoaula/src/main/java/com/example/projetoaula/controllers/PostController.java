package com.example.projetoaula.controllers;

import com.example.projetoaula.models.PostModel;
import com.example.projetoaula.services.PostService;
import jakarta.persistence.criteria.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping
    public List<PostModel> getPosts(
            @RequestParam(value = "views", required = false) Integer views,
            @RequestParam(value = "views_gt", required = false) Integer viewsGt,
            @RequestParam(value = "views_gte", required = false) Integer viewsGte,
            @RequestParam(value = "views_lt", required = false) Integer viewsLt,
            @RequestParam(value = "views_lte", required = false) Integer viewsLte,
            @RequestParam(value = "views_ne", required = false) Integer viewsNe,
            @RequestParam(value = "start", required = false) Integer start,
            @RequestParam(value = "end", required = false) Integer end
    ) {
        // root -> recebe a entidade PostModel
        // query -> referencia qual consulta que será construída
        // criteriaBuilder -> condição
        Specification<PostModel> spec = ((root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>(); // predicate é um tipo de dado usado para salvar todas as condições do where

            if (views != null) {
                predicates.add(criteriaBuilder.equal(root.get("views"), views));
            }

            if (viewsGt != null) {
                predicates.add(criteriaBuilder.greaterThan(root.get("views"), viewsGt));
            }

            if (viewsGte != null) {
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("views"), viewsGte));
            }

            if (viewsLt != null) {
                predicates.add(criteriaBuilder.lessThan(root.get("views"), viewsLt));
            }

            if (viewsLte != null) {
                predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get("views"), viewsLte));
            }

            if (viewsNe != null) {
                predicates.add(criteriaBuilder.notEqual(root.get("views"), viewsNe));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        });

        if (end != null) {
            return postService.getPosts(spec, start, end);
        }

        return postService.getPosts(spec);
    }
}
