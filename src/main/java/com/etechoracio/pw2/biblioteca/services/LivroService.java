package com.etechoracio.pw2.biblioteca.services;

import com.etechoracio.pw2.biblioteca.models.LivroModel;
import com.etechoracio.pw2.biblioteca.repositories.ILivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private ILivroRepository repository;

    public ResponseEntity<LivroModel> CriarLivroAsync(LivroModel model) throws Exception {
        if (model.getDisponivel() == null || model.getAutor() == null || model.getTitulo() == null) {
            throw new Exception("Some fields are null");
        }

        var newModel = repository.save(model);
        return ResponseEntity.status(201).body(newModel);
    }
}
