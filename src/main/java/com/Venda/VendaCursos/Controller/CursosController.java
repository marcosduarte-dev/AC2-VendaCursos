package com.Venda.VendaCursos.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Venda.VendaCursos.Entity.Aluno;
import com.Venda.VendaCursos.Entity.CursosModel;


@RestController
@RequestMapping("/cursos")
public class CursosController {
	
	private List<Aluno> alunos = new ArrayList<>();
	public List<CursosModel> cursos = new ArrayList<>();
	
	/*@GetMapping("/meusCursos/{alunoId}")
	public List<CursosModel> getMeusCursosByAluno(@PathVariable int alunoId) throws Exception {
		Aluno aluno = alunos.get(alunoId);
		
		return aluno.getMeusCursosByAluno();
		
	}*/
	
	@GetMapping("/curso/comprar/{alunoId}/{cursoId}")
	public boolean comprarCurso(@PathVariable int alunoId, int cursoId) {
		
		Aluno aluno = alunos.get(alunoId);
		CursosModel curso = cursos.get(cursoId);
		
		//aluno.getCursosAdicionais().add(cursoId);
		aluno.setMensalidade(aluno.getMensalidade() + curso.getPreco());
		
		return true;
	}
}
