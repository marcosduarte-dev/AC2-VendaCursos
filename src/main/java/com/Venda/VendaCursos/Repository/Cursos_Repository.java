package com.Venda.VendaCursos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Venda.VendaCursos.Entity.CursosModel;

@Repository
public interface Cursos_Repository extends JpaRepository<CursosModel, Long>{

}
