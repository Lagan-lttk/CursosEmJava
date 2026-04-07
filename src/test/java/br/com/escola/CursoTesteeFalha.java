package br.com.escola;

import br.com.escola.cursos.CursosDisponiveis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CursoTesteeFalha {

    @Test
    public void testeLista() {

        CursosDisponiveis cursos = new CursosDisponiveis();

        assertNotNull(cursos);

    }

    @Test
    public void Falha() {

        int esperado = 10;
        int obtido = 5;

        assertEquals(esperado, obtido);

    }


}