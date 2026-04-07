package br.com.escola;

import br.com.escola.cursos.CursosDisponiveis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CursoTest {

    @Test
    public void Falha() {

        int x = 10;
        int y = 5;

        assertEquals(x, y);

    }

    @Test
    public void testeLista() {

        CursosDisponiveis cursos = new CursosDisponiveis();

        assertNotNull(cursos);

    }



}