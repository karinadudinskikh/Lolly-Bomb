package ejerciciosPruebas;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio5Test {

    @Test
    public void camino1() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(20);
        array.add(10);
        array.add(0);
        assertEquals(20f, Ejercicio5.obtenerMedia(array));

    }

    @Test
    public void camino2() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(20);
        array.add(0);
        assertEquals(20f, Ejercicio5.obtenerMedia(array));

    }

    @Test
    public void camino3() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(30);
        array.add(0);
        assertEquals(30f, Ejercicio5.obtenerMedia(array));

    }
}