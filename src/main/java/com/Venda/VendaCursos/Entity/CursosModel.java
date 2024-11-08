package com.Venda.VendaCursos.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cursos")
public class CursosModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
	private long id;
	private String titulo;
	private int qtdeAulas;
	private boolean isBasico;
	private float preco;
	
	public CursosModel() {
	}
	
	public CursosModel(long id, String titulo, int qtdeAulas, boolean isBasico, float preco) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.qtdeAulas = qtdeAulas;
		this.isBasico = isBasico;
		this.preco = preco;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getQtdeAulas() {
		return qtdeAulas;
	}
	public void setQtdeAulas(int qtdeAulas) {
		this.qtdeAulas = qtdeAulas;
	}
	
	public boolean isBasico() {
		return isBasico;
	}
	public void setBasico(boolean isBasico) {
		this.isBasico = isBasico;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
}
