package com.example.aula.primeiroprojeto.repositories;

import com.example.aula.primeiroprojeto.models.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<CategoryModel, UUID> {
}
