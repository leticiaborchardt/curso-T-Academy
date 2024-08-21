package com.example.projetoaula.services;

import com.example.projetoaula.models.PostModel;
import com.example.projetoaula.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<PostModel> getPosts(Specification<PostModel> spec) {
        return postRepository.findAll(spec);
    }

    public List<PostModel> getPosts(Specification<PostModel> spec, int start, int end) {
        return postRepository.findAll(spec);
    }

//    public List<PostModel> getPostsLimit(Specification<PostModel> spec, int start, int limit) {
//        return postRepository.findAll(spec);
//    }
}
