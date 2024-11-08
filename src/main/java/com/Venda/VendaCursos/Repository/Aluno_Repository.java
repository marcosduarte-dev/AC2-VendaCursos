package com.Venda.VendaCursos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Venda.VendaCursos.Entity.Aluno;


@Repository
public interface Aluno_Repository extends JpaRepository<Aluno, Long>{

}
