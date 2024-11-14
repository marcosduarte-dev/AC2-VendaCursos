package com.Venda.VendaCursos.dto;

import com.Venda.VendaCursos.Entity.Aluno;
import com.Venda.VendaCursos.Entity.CursosModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursosDTO {
	
	private long id;
	private String titulo;
	private int qtdeAulas;
	private float preco;
	
	public static CursosDTO fromEntity(CursosModel curso) {
    	CursosDTO cursoDTO = new CursosDTO();
    	cursoDTO.setId(curso.getId());
    	cursoDTO.setPreco(curso.getPreco());
    	cursoDTO.setQtdeAulas(curso.getQtdeAulas());
    	cursoDTO.setTitulo(curso.getTitulo());

        return cursoDTO;
    }

}
