package examenB;

import java.util.ArrayList;

public class Ejercicio1_B {
    public static int cuentaPares(ArrayList numeros)
    {
        int cuentaPares=0,num;
        num=(Integer)numeros.remove(0);

        while(num!=0) {
            num=(Integer)numeros.remove(0);
            if(num%2==0)
                cuentaPares++;
        }
        return cuentaPares;
    }
}
