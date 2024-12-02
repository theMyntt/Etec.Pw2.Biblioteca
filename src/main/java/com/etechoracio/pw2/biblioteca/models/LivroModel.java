package com.etechoracio.pw2.biblioteca.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_LIVROS")
public class LivroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LIVRO")
    private Long id;

    @Column(name = "TX_TITULO")
    private String titulo;

    @Column(name = "TX_NOME_AUTOR")
    private String autor;

    @Column(name = "TX_DISPONIBILIDADE")
    private Boolean disponivel;
}
