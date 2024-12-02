package com.etechoracio.pw2.biblioteca.controllers;

import com.etechoracio.pw2.biblioteca.models.EmprestimoModel;
import com.etechoracio.pw2.biblioteca.services.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emprestimo")
public class EmprestimoController {
    @Autowired
    private EmprestimoService service;

    @GetMapping("{name}")
    public List<EmprestimoModel> GetAsync(@PathVariable String name) {
        return service.GetAsync(name);
    }

    @PostMapping
    public ResponseEntity<EmprestimoModel> CreateAsync(@RequestBody EmprestimoModel model) {
        return service.CreateAsync(model);
    }
}
