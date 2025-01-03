package com.etechoracio.pw2.biblioteca.services;

import com.etechoracio.pw2.biblioteca.models.EmprestimoModel;
import com.etechoracio.pw2.biblioteca.repositories.IEmprestimoRepository;
import com.etechoracio.pw2.biblioteca.repositories.ILivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoService {
    @Autowired
    private IEmprestimoRepository emprestimoRepository;

    @Autowired
    private ILivroRepository livroRepository;

    public List<EmprestimoModel> GetAsync(String nome) {
        return emprestimoRepository.findByUsuarioIgnoreCase(nome);
    }

    public ResponseEntity<EmprestimoModel> CreateAsync(EmprestimoModel model) {
        var bruteLivro = livroRepository.findById(model.getLivro().getId());
        if (bruteLivro.isEmpty()) throw new RuntimeException("Nenhum livro encontrado");

        var livro = bruteLivro.get();
        if (!livro.getDisponivel()) throw new RuntimeException("O livro não está disponível");

        var emprestimos = emprestimoRepository.findByUsuarioIgnoreCase(model.getUsuario());
        if (emprestimos.size() >= 3) throw new RuntimeException("O usuário tem mais de 3 emprestimos");

        var emprestimo = emprestimoRepository.save(model);

        livro.setDisponivel(false);
        livroRepository.save(livro);

        return ResponseEntity.status(201).body(emprestimo);
    }
}
