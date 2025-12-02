package parcial.estructuradatos.forawhile;

import java.util.Scanner;

public class Video7_FOR_a_WHILE 
{
    
    public static void main(String[] ar) 
    {
        Scanner teclado = new Scanner(System.in);

        int positivos = 0, negativos = 0, multiplos15 = 0, sumaPares = 0;
        int valor;

        int f = 1;
        while (f <= 10) 
        {
            System.out.print("Ingrese el valor:");
            valor = teclado.nextInt();

            if (valor > 0) 
            {
                positivos++;
            } else {
                if (valor < 0) 
                {
                    negativos++;
                }
            }

            if (valor % 15 == 0) 
            {
                multiplos15++;
            }

            if (valor % 2 == 0) 
            {
                sumaPares = sumaPares + valor;
            }
            f++;
        }

        System.out.println("Cantidad de valores negativos ingresados: " + negativos);
        System.out.println("Cantidad de valores positivos ingresados: " + positivos);
        System.out.println("Cantidad de valores multiplos de 15: " + multiplos15);
        System.out.println("La suma de todos los valores pares: " + sumaPares);
    }
}

