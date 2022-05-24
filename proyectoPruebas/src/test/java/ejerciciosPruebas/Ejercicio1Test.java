package ejerciciosPruebas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {

    @Test
    void testEj1() {
        assertEquals(7,Ejercicio1.mayorDeCuatroEj2(7,2,4,3));
    }

    @Test
    void testEj2() {
        assertEquals(8,Ejercicio1.mayorDeCuatroEj2(7,2,4,8));
    }

    @Test
    void testEj3() {
        assertEquals(8,Ejercicio1.mayorDeCuatroEj2(7,2,8,4));
    }

    @Test
    void testEj4() {
        assertEquals(9,Ejercicio1.mayorDeCuatroEj2(7,2,8,9));
    }

    @Test
    void testEj5() {
        assertEquals(7,Ejercicio1.mayorDeCuatroEj2(2,7,6,2));
    }

    @Test
    void testEj6() {
        assertEquals(10,Ejercicio1.mayorDeCuatroEj2(2,7,6,10));
    }

    @Test
    void testEj7() {
        assertEquals(7,Ejercicio1.mayorDeCuatroEj2(2,5,7,1));
    }

    @Test
    void testEj8() {
        assertEquals(10,Ejercicio1.mayorDeCuatroEj2(2,3,7,10));
    }

}