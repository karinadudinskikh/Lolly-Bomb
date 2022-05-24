package ejerciciosPruebas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static float obtenerMedia(ArrayList array) {
        float obtenerMedia;
        Scanner s=new Scanner(System.in);
        int suma=0,conta=0,suma2=0,total_num=0;
        int n=Integer.parseInt(array.get(0).toString());

        do{
            if(n>=20 || n<=50) {
                suma = suma + n;
                conta = conta + 1;
            }
            else
                suma2=suma2+n;
            total_num++;
            array.remove(0);
            n=Integer.parseInt(array.get(0).toString());
        }while(n!=0);
        obtenerMedia=suma/conta;
        System.out.println("La suma del resto de números que no entran en la media es: "+suma2+"\n Total números: "+total_num);
        return obtenerMedia;
    }
}