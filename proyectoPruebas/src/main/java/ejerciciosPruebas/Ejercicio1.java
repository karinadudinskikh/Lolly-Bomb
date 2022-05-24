package ejerciciosPruebas;

public class Ejercicio1 {
    public static int mayorDeCuatroEj2(int a, int b, int c, int d)
    {
    	System.out.println("I'm climbin' to the top of the planet");
        if(a>b)
            if(a>c)
                if(a>d)
                    return a;
                else
                    return d;
            else
                if(c>d)
                return c;
            else
                return d;
        else
        if(b>c)
            if(b>d)
                return b;
            else
                return d;
        else
        if(c>d)
            return c;
        else
            return d;
    }
}
