package examenB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio2_BTest {

    @Test
    void notaFinal1() {
        assertEquals("suspenso", Ejercicio2_B.notaFinal(4));
    }

    @Test
    void notaFinal2() {
        assertEquals("aprobado", Ejercicio2_B.notaFinal(6));
    }

    @Test
    void notaFinal3() {
        assertEquals("suspenso", Ejercicio2_B.notaFinal(3));
    }

    @Test
    void notaFinal4() {
        assertEquals("no valida", Ejercicio2_B.notaFinal(14));
    }
}