package com.etechoracio.pw2.biblioteca.repositories;

import com.etechoracio.pw2.biblioteca.models.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILivroRepository extends JpaRepository<LivroModel, Long> {
}
