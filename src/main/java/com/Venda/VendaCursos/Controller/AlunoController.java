package com.Venda.VendaCursos.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Venda.VendaCursos.Entity.Aluno;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	private List<Aluno> alunos = new ArrayList<>();

	@GetMapping("/pagar/{id}")
	public Aluno pagar(@PathVariable int id) {
		Aluno aluno = alunos.get(id);
				
		return aluno.pagar();
	}
	
	@GetMapping("/logar/{id}")
	public Aluno logar(@PathVariable int id) {
		Aluno aluno = alunos.get(id);
		
		return aluno.logar();
	}
}
