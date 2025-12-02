package previa.taller.ejercicios.marzo.pkg31;
 
import java.util.Arrays;
import java.util.Scanner;

public class p5 
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
    
    public void ordenar()
    {
        Arrays.sort(x);
        System.out.println(" ");
        System.out.println("Arreglo ordenado de menor a mayor: "+Arrays.toString(x));
    }
    
    public static void main(String[] args) 
    {
        p5 p=new p5();
        p.inicio();
        p.imprimir();
        p.cargar();
        p.imprimir();
        p.ordenar();
    }
}

