package parcial.Estructuradatos.whileafor;

import java.util.Scanner;

public class Video6_WHILE_a_FOR 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int suma1 = 0;
        int suma2 = 0;
        int valor;

        for (int x = 1; x <= 15; x++) 
        {
            System.out.print("Ingrese valor de la primer lista:");
            valor = teclado.nextInt();
            suma1 = suma1 + valor;
        }

        for (int x = 1; x <= 15; x++) 
        {
            System.out.print("Ingrese valor de la segunda lista:");
            valor = teclado.nextInt();
            suma2 = suma2 + valor;
        }

        if (suma1 > suma2) 
        {
            System.out.print("Lista 1 mayor");
        } else {
            if (suma2 > suma1) 
            {
                System.out.print("Lista 2 mayor");
            } else {
                System.out.print("Listas iguales");
            }
        }
    }
}