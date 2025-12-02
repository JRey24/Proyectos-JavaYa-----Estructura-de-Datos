package parcial.Estructuradatos.whileafor;

import java.util.Scanner;

public class Video7_WHILE_a_FOR 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int n;
        int valor;

        System.out.print("Cuantos numeros ingresara:");
        n = teclado.nextInt();

        for (int x = 1; x <= n; x++) 
        {
            System.out.print("Ingrese un valor entero:");
            valor = teclado.nextInt();
            if (valor % 2 == 0) 
            {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }
        }
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }
}