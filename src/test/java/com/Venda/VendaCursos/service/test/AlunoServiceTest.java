package com.Venda.VendaCursos.service.test;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.Venda.VendaCursos.Entity.Aluno;
import com.Venda.VendaCursos.Entity.Aluno_Email;
import com.Venda.VendaCursos.Repository.Aluno_Repository;
import com.Venda.VendaCursos.Service.AlunoService;
import com.Venda.VendaCursos.dto.AlunoDTO;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class AlunoServiceTest {
	
	@Mock
    private Aluno_Repository alunoRepository;

    @InjectMocks
    private AlunoService alunoService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllAlunos() {

        Aluno aluno1 = new Aluno();
        aluno1.setId(1L);
        aluno1.setNome("aluno1");
        aluno1.setRA("111111");
        aluno1.setMensalidade(10);
        aluno1.setEmail(new Aluno_Email("aluno1@example.com"));

        Aluno aluno2 = new Aluno();
        aluno2.setId(2L);
        aluno2.setNome("aluno2");
        aluno2.setRA("222222");
        aluno2.setMensalidade(20);
        aluno2.setEmail(new Aluno_Email("aluno2@example.com"));

        when(alunoRepository.findAll()).thenReturn(Arrays.asList(aluno1, aluno2));

        List<AlunoDTO> alunos = alunoService.getAllAlunos();

        assertEquals(2, alunos.size());
        assertEquals("aluno1", alunos.get(0).getNome());
        assertEquals("aluno1@example.com", alunos.get(0).getEmail());
    }

}
