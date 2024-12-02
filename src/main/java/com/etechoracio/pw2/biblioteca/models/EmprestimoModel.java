package com.etechoracio.pw2.biblioteca.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "TBL_EMPRESTIMOS")
public class EmprestimoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EMPRESTIMO")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "FK_LIVRO")
    private LivroModel livro;

    @Column(name = "TX_EMPRESTIMO")
    private LocalDate dataEmprestimo;

    @Column(name = "TX_DEVOLUCAO")
    private LocalDate dataDevolucao;

    @Column(name = "TX_USUARIO")
    private String usuario;
}
