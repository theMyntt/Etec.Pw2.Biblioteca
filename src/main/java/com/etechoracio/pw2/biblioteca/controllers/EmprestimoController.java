package com.etechoracio.pw2.biblioteca.controllers;

import com.etechoracio.pw2.biblioteca.models.EmprestimoModel;
import com.etechoracio.pw2.biblioteca.services.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emprestimo")
public class EmprestimoController {
    @Autowired
    private EmprestimoService service;

    @PostMapping
    public ResponseEntity<EmprestimoModel> CreateAsync(@RequestBody EmprestimoModel model) {
        return service.CreateAsync(model);
    }
}
