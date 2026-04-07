package br.com.escola;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteFalha {

    @Test
    public void testeQueFalha() {

        int esperado = 10;
        int obtido = 5;

        assertEquals(esperado, obtido);

    }

}