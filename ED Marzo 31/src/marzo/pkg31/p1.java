package marzo.pkg31;

import java.util.Scanner;

public class p1 
{

    static int x[],tam,i;
    static Scanner teclado =new Scanner(System.in);
    
    public void inicializar()
    {
        System.out.println("Digite tamaño del arreglo: ");
        tam=teclado.nextInt();
        x=new int[tam];
    }
            
    public void imprimir()
    {
        for (i=0;i<tam;i++)
        {
            System.out.print(" "+x[i]);
            System.out.print(" ");
            
        }
    }
    
    public void cargar()
    {
        System.out.println(" ");
        for (i=0;i<tam;i++)
        {
            System.out.println("Digite x[" +i+ "]: ");
            x[i]=teclado.nextInt();
        }
    }
    
    public static void mayor()
    {
        int mayor,pos;
        mayor=x[0];
        pos=0;
        for(i=0; i<tam; i++)
        {
            if (x[i]>mayor)
            {
               mayor = x[i];
               pos = i;
            }
        }
        System.out.println(" ");
        System.out.println("Mayor es: "+mayor);
        System.out.println("Posicion es: "+pos);
    }
    
        public static void menor()
    {
        int menor,pos;
        menor=x[0];
        pos=0;
        for(i=0; i<tam; i++)
        {
            if (x[i]<menor)
            {
               menor = x[i];
               pos = i;
            }
        }
        System.out.println("Menor es: "+menor);
        System.out.println("Posicion es: "+pos);
    }
    
    public static void main(String[] args) 
    {
        p1 p=new p1();
        p.inicializar();
        p.imprimir();
        p.cargar();
        p.imprimir();
        p.mayor();
        p.menor();
    } 
}
