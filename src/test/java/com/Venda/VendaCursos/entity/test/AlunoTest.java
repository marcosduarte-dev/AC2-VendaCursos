package com.Venda.VendaCursos.entity.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.Venda.VendaCursos.Entity.Aluno;
import com.Venda.VendaCursos.Entity.Aluno_Email;

public class AlunoTest {
	
	@Test
    void testSetAndGetValidEmail() {
        Aluno user = new Aluno();
        Aluno_Email email = new Aluno_Email("test@example.com");
        user.setEmail(email);
        
        assertEquals(email, user.getEmail());
    }

    @Test
    void testInvalidEmailThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Aluno_Email("invalid-email");
        });
    }

}
