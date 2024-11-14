package com.Venda.VendaCursos.dto;

import com.Venda.VendaCursos.Entity.Aluno;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoDTO {

	private Long id;
    private String nome;
    private String email;
    private String ra;
    private float mensalidade;
    
    public static AlunoDTO fromEntity(Aluno aluno) {
    	AlunoDTO alunoDTO = new AlunoDTO();
    	alunoDTO.setId(aluno.getId());
    	alunoDTO.setNome(aluno.getNome());
    	alunoDTO.setRa(aluno.getRA());
    	alunoDTO.setMensalidade(aluno.getMensalidade());
    	
        if (aluno.getEmail() != null) {
            alunoDTO.setEmail(aluno.getEmail().getEmailAddress());
        }

        return alunoDTO;
    }
	
}
