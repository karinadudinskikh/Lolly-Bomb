package ejerciciosPruebas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio2Test {

    @Test
    void funcionEj3Prueba1() {
        assertEquals(123750, Ejercicio2.funcionEj3(1100));
    }

    @Test
    void funcionEj3Prueba2() {
        assertEquals(118750, Ejercicio2.funcionEj3(1000));
    }

    @Test
    void funcionEj3Prueba3() {
        assertEquals(12500, Ejercicio2.funcionEj3(100));
    }
}