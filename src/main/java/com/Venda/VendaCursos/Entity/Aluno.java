package com.Venda.VendaCursos.Entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_aluno")
@Data
@NoArgsConstructor
public class Aluno {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
	private long id;
	private String nome;
	private String RA;
	private LocalDate dataRenovacao = LocalDate.now();
	private float mensalidade;
	private boolean logado;
	
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

}
