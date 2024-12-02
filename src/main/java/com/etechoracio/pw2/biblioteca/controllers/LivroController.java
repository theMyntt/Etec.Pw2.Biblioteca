package com.etechoracio.pw2.biblioteca.controllers;

import com.etechoracio.pw2.biblioteca.models.LivroModel;
import com.etechoracio.pw2.biblioteca.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/livro/")
public class LivroController {
    @Autowired
    private LivroService service;

    public ResponseEntity<LivroModel> Create(@RequestBody LivroModel model) throws Exception {
        return service.CriarLivroAsync(model);
    }
}
