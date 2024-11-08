package com.Venda.VendaCursos.Entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno {
	
	//public List<CursosModel> cursos = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
	private long id;
	private String nome;
	private String RA;
	private LocalDate dataRenovacao = LocalDate.now();
	private float mensalidade;
	private boolean logado;
	//private List<Integer> cursosAdicionais;
	
	@Embedded
    private Aluno_Email email;
	
	public Aluno(long id, String nome, String ra, 
			LocalDate dataRenovacao, float mensalidade, boolean logado,
			List<Integer> cursosAdicionais) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataRenovacao = dataRenovacao;
		this.mensalidade = mensalidade;
		this.logado = logado;
		//this.cursosAdicionais = cursosAdicionais;
	}
	
	public Aluno() {
		
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public LocalDate getDataRenovacao() {
		return dataRenovacao;
	}
	public void setDataRenovacao(LocalDate dataRenovacao) {
		this.dataRenovacao = dataRenovacao;
	}
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	public boolean getLogado() {
		return logado;
	}
	public void setLogado(boolean logado) {
		this.logado = logado;
	}
	/*public List<Integer> getCursosAdicionais() {
		return cursosAdicionais;
	}
	public void setCursosAdicionais(List<Integer> cursosAdicionais) {
		this.cursosAdicionais = cursosAdicionais;
	}*/
	
	public Aluno_Email getEmail() {
        return email;
    }

    public void setEmail(Aluno_Email email) {
        this.email = email;
    }
	
	public Aluno pagar() {
		if(this.getDataRenovacao().isBefore(LocalDate.now())) {
			this.setDataRenovacao(LocalDate.now().plusDays(30));
		} else {
			this.setDataRenovacao(this.getDataRenovacao().plusDays(30));
		}
		return this;
	}
	
	public Aluno logar() {
		this.setLogado(true);
		return this;
	}
	
	/*public List<CursosModel> getMeusCursosByAluno() throws Exception {
		List<CursosModel> retorno = new ArrayList<CursosModel>();
		
		if(this.getDataRenovacao().isBefore(LocalDate.now())) {
			throw new Exception("Sem acesso, por favor realize a renovacao da sua assinatura");
		}
		
		for (CursosModel curso : cursos) {
		    if (curso.isBasico()) {
		        retorno.add(curso);
		    } else if(this.getCursosAdicionais().contains(curso.getId())) {
		    	retorno.add(curso);
		    }
		}
		
		return retorno;
	}*/
	
	/*public boolean comprarCurso(int cursoId) {
		CursosModel curso = cursos.get(cursoId);
		
		//this.getCursosAdicionais().add(cursoId);
		this.setMensalidade(this.getMensalidade() + curso.getPreco());
		
		return true;
	}*/

}
