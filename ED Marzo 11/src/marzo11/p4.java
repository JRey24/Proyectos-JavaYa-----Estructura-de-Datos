package marzo11;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) 
    {
        Scanner teclado=new Scanner(System.in);
        int i,n,s,f;
        float p;
            System.out.println("Cantidad de datos que quiera ingresar: ");
            n = teclado.nextInt();
            s=0;
            for(i=1; i<=n;i++)
            {
                System.out.println("Ingrese el dato de su eleccion "+i+": " );
                f = teclado.nextInt();
                s=s+f;
            }
        System.out.println("La Sumatoria es "+s+": ");
        p=(float)s/n;
        System.out.println("El Promedio es "+p+": ");
    } 
}