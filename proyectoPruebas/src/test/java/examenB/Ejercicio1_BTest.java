package examenB;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1_BTest {
    private ArrayList<Integer> numero=new ArrayList<Integer>();

    @Test
    void cuentaPares1() {
        numero.add(0);
        assertEquals(0, Ejercicio1_B.cuentaPares(numero));
    }

    @Test
    void cuentaPares2() {
        numero.add(4);
        numero.add(0);
        assertEquals(1, Ejercicio1_B.cuentaPares(numero));
    }
}