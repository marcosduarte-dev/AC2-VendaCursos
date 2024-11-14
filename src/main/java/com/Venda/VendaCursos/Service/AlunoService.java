package com.Venda.VendaCursos.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Venda.VendaCursos.Entity.Aluno;
import com.Venda.VendaCursos.Repository.Aluno_Repository;
import com.Venda.VendaCursos.dto.AlunoDTO;

@Service
public class AlunoService {

	@Autowired
    private Aluno_Repository alunosRepository;
	
    public List<AlunoDTO> getAllAlunos() {
        List<Aluno> alunos = alunosRepository.findAll();
        return alunos.stream()
                    .map(AlunoDTO::fromEntity)
                    .collect(Collectors.toList());
    }
	
}
