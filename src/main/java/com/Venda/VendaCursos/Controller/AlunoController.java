package com.Venda.VendaCursos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Venda.VendaCursos.Service.AlunoService;
import com.Venda.VendaCursos.dto.AlunoDTO;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
    private AlunoService alunoService;
	
	@GetMapping
    public List<AlunoDTO> getAlunos() {
        return alunoService.getAllAlunos(); 
    }
}
