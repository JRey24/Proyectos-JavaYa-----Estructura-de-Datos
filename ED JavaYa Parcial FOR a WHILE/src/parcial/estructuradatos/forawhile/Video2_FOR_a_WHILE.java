package parcial.estructuradatos.forawhile;

import java.util.Scanner;

public class Video2_FOR_a_WHILE 
{

    public static void main(String[] ar) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        int valor;
        int f = 1;

        while (f <= 10) 
        {
            System.out.print("Ingrese el valor:");
            valor = teclado.nextInt();

            if (f > 5) 
            {
                suma = suma + valor;
            }
            f++; 
        }
        System.out.print("La suma de los ultimos 5 valores ingresados:" + suma);
    }
} 

