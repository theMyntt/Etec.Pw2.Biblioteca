package com.etechoracio.pw2.biblioteca.repositories;

import com.etechoracio.pw2.biblioteca.models.EmprestimoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmprestimoRepository extends JpaRepository<EmprestimoModel, Long> {
    List<EmprestimoModel> findByUsuarioIgnoreCase(String nome);
}
