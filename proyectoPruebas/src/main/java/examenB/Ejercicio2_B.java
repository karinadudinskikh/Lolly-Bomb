package examenB;

public class Ejercicio2_B {

    public static String notaFinal(float nota) {
        String res="";
        // devolveremos "aprobado" si la nota es mayor de 5 y menor o igual a 10
        // devolveremos "suspenso" si la nota es menor de 5 y mayor de 0
        // devolveremos "no valida" si la nota es otra cosa
        // si tipo vale 's' es sacar dinero, si tipo vale 'i' es ingresar dinero
        if (nota <0 || nota > 10)
            res="no valida";
        else
        if(nota>=5)
            res="aprobado";
        else
            return "suspenso";

        return res;
    }
}
