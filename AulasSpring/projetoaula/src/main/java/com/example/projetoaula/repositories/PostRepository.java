package com.example.projetoaula.repositories;

import com.example.projetoaula.models.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<PostModel, Long>, JpaSpecificationExecutor<PostModel> {
    List<PostModel> findByViewsGreaterThan(Integer views);
    List<PostModel> findByViewsLessThan(Integer views);
    List<PostModel> findByViewsBetween(Integer lowerBound, Integer upperBound);
}
