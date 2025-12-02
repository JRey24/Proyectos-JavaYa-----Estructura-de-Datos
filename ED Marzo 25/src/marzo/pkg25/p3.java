package marzo.pkg25;

import java.util.Scanner;

public class p3 {
    static int x[];
    static int tam;
    static Scanner teclado;
    
    static void pedirtamaño()
    {
        System.out.println("Digite el tamaño del arreglo");
        teclado=new Scanner(System.in);
        tam = teclado.nextInt();
        x = new int [tam];
    }
    static void imprimir()
    {
        for(int i = 0; i<tam; i++)
            System.out.println(i+" "+x[i]);
    }
    static void cargardatos()
    {
         for(int i = 0; i<tam; i++)
         {
            System.out.println("Digite el contenido de la posicion: " +i+ " ");
            x[i]=teclado.nextInt();
         }
    }
    static void promediar()
    {
        int suma = 0;
        for(int i = 0; i<tam; i++)
         {
              suma = suma + x[i];
         }
        System.out.println("La suma es: "+suma);
        float prom=(float)suma/tam;
        System.out.println("El promedio es "+prom);
    }
    public static void main(String[] args)
    {
        pedirtamaño();
        imprimir();
        cargardatos();
        imprimir();
        promediar();
    }
}