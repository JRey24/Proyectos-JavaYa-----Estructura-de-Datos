package previa.taller.ejercicios.marzo.pkg31;

import java.util.Scanner;

public class p2
{
    static int x[],tam,i;
    static Scanner teclado =new Scanner(System.in);
    
    public void inicio()
    {
        System.out.println("Digite tamaño del arreglo entre [1 a 7]: ");
        tam=teclado.nextInt();
        x=new int[tam];
        for (; tam > 7; ) 
        {
            System.out.println("No se permite el tamaño " + tam + ". Solo números menores o iguales a 7");
            System.out.print("Ingrese un nuevo tamaño: ");
            tam = teclado.nextInt();
        }
        
        System.out.println("Tamaño aceptado: " + tam);
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
    
    public int calcularFactorial(int n) {

        if (n == 0) 
        {
            return 1;
        }
        System.out.println(" ");
        int result = 1;
        System.out.print("1");
        for (i=2; i<=n; i++) 
        {
            result *= i;
            System.out.print(" * " + i);
        }
        return result;
    }
    
    public void factorial()
    {
        int sum = 0;
        for (int num : x) 
        {
            int fact = calcularFactorial(num);

            System.out.print("  Factorial de " + num + ": "+fact);
            sum += fact;
        }
        System.out.println(" ");
        System.out.println("Suma de factoriales: " + sum);
    }
    

    public static void main(String[] args) 
    {
        p2 p=new p2();
        p.inicio();
        p.imprimir();
        p.cargar();
        p.imprimir();
        p.factorial();
    }
}

