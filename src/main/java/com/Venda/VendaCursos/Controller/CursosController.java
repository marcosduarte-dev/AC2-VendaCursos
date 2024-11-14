package com.Venda.VendaCursos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Venda.VendaCursos.Service.CursoService;
import com.Venda.VendaCursos.dto.CursosDTO;


@RestController
@RequestMapping("/cursos")
public class CursosController {
	
	@Autowired
    private CursoService cursoService;
	
	@GetMapping
    public List<CursosDTO> getCursos() {
        return cursoService.getAllCursos(); 
    }
}
