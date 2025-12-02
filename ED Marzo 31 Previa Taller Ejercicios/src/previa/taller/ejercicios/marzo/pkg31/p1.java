package previa.taller.ejercicios.marzo.pkg31;

import java.util.Scanner;

public class p1 
{

    static int x[],tam,i;
    static Scanner teclado =new Scanner(System.in);
    
    public void inicio()
    {
        System.out.println("Digite tamaño del arreglo: ");
        tam=teclado.nextInt();
        x=new int[tam];
    }
            
    public void imprimir()
    {
        for (i=0;i<tam;i++)
        {
            System.out.print(""+x[i]);
            System.out.print(" ");
        }
    }
    
    public void cargar()
    {
        System.out.println(" ");
        for (i=0;i<tam;i++)
        {
            System.out.println("Digite el contenido de la posicion x[" +i+ "]: ");
            x[i]=teclado.nextInt();
        }
    }
    
    public void paresimpares ()
    {
        int pares =0;
        int impares =0;
        
         for(i=0;i<tam;i++)
        {
            if (x[i] % 2 == 0) 
            {
                pares = pares + 1;
            } 
            else 
            {
                impares = impares + 1;
            }
        }
        System.out.println(" ");
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
        
    }
    
    public static void main(String[] args) 
    {
        p1 p=new p1();
        p.inicio();
        p.imprimir();
        p.cargar();
        p.imprimir();
        p.paresimpares();
    }
}
