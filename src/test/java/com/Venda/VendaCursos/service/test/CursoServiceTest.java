package com.Venda.VendaCursos.service.test;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.Venda.VendaCursos.Entity.CursosModel;
import com.Venda.VendaCursos.Repository.Cursos_Repository;
import com.Venda.VendaCursos.Service.CursoService;
import com.Venda.VendaCursos.dto.CursosDTO;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CursoServiceTest {
	
	@Mock
    private Cursos_Repository cursoRepository;

    @InjectMocks
    private CursoService cursoService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllCursos() {

        CursosModel curso1 = new CursosModel();
        curso1.setId(1L);
        curso1.setBasico(true);
        curso1.setPreco(10);
        curso1.setQtdeAulas(5);
        curso1.setTitulo("curso1");

        CursosModel curso2 = new CursosModel();
        curso2.setId(2L);
        curso2.setBasico(false);
        curso2.setPreco(20);
        curso2.setQtdeAulas(10);
        curso2.setTitulo("curso2");

        when(cursoRepository.findAll()).thenReturn(Arrays.asList(curso1, curso2));

        List<CursosDTO> cursos = cursoService.getAllCursos();

        assertEquals(2, cursos.size());
        assertEquals("curso1", cursos.get(0).getTitulo());
        assertEquals("curso2", cursos.get(1).getTitulo());
    }

}
