package com.Venda.VendaCursos.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cursos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CursosModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
	private long id;
	private String titulo;
	private int qtdeAulas;
	private boolean isBasico;
	private float preco;
	
}
