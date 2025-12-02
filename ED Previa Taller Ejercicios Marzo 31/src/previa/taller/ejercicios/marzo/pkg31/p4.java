package previa.taller.ejercicios.marzo.pkg31;

import java.util.Arrays;
import java.util.Scanner;

public class p4 
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
    
      public static void invertir ()
    {
        for (int i = 0, j = tam - 1; i < j; i++, j--) {
            int temp = x[i];
            x[i] = x[j];
            x[j] = temp;
        }
         System.out.println(" ");
         System.out.println("Arreglo invertido: " + Arrays.toString(x));
    } 
    
    public static void main(String[] args) 
    {
        p4 p=new p4();
        p.inicio();
        p.imprimir();
        p.cargar();
        p.imprimir();
        p.invertir();
    }
    
}
