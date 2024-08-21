package com.example.projetoaula.services;

import com.example.projetoaula.models.Livro;
import com.example.projetoaula.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> buscarLivros(Example<Livro> example) {
        return livroRepository.findAll(example);
    }
}
