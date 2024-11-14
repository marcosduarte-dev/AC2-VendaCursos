package com.Venda.VendaCursos.repository.test;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Venda.VendaCursos.Entity.Aluno;
import com.Venda.VendaCursos.Entity.Aluno_Email;
import com.Venda.VendaCursos.Repository.Aluno_Repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class AlunoRepositoryTest {

	@Autowired
    private Aluno_Repository alunoRepository;

    @Test
    void testSaveAndFindAluno() {

        Aluno aluno = new Aluno();
        aluno.setNome("testAluno");
        aluno.setEmail(new Aluno_Email("test@example.com"));

        Aluno savedAluno = alunoRepository.save(aluno);
        assertNotNull(savedAluno.getId()); 

        Optional<Aluno> retrievedAluno = alunoRepository.findById(savedAluno.getId());
        assertTrue(retrievedAluno.isPresent());
        assertEquals("testAluno", retrievedAluno.get().getNome	());
   }
	
}
