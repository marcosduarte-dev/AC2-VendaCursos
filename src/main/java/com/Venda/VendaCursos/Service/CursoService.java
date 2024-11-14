package com.Venda.VendaCursos.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Venda.VendaCursos.Entity.CursosModel;
import com.Venda.VendaCursos.Repository.Cursos_Repository;
import com.Venda.VendaCursos.dto.CursosDTO;

@Service
public class CursoService {

	@Autowired
    private Cursos_Repository cursosRepository;
	
    public List<CursosDTO> getAllCursos() {
        List<CursosModel> cursos = cursosRepository.findAll();
        return cursos.stream()
                    .map(CursosDTO::fromEntity)
                    .collect(Collectors.toList());
    }
	
}
