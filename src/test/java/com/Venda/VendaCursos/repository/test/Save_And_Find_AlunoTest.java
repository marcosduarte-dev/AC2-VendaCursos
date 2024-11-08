package com.Venda.VendaCursos.repository.test;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.Venda.VendaCursos.Entity.Aluno;
import com.Venda.VendaCursos.Repository.Aluno_Repository;

@DataJpaTest
public class Save_And_Find_AlunoTest {
	
	@Autowired
    private Aluno_Repository alunoRepository;

    @Test
    public void testSaveAndFindUser() {

        Aluno aluno = new Aluno();
        aluno.setNome("testUser1");

        // Salva no banco de dados
        Aluno savedAluno = alunoRepository.save(aluno);
        assertNotNull(savedAluno.getId());
 
        Optional<Aluno> retrievedUser = alunoRepository.findById(savedAluno.getId());
        assertThat(retrievedUser).isPresent();
        assertThat(retrievedUser.get().getNome()).isEqualTo("testUser1");
    }
	
}
