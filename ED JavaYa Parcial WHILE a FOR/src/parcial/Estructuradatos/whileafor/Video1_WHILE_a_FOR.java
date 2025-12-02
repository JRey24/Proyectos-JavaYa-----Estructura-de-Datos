package parcial.Estructuradatos.whileafor;

import java.util.Scanner;

public class Video1_WHILE_a_FOR 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int x, altas, bajas, nota;
        altas = 0;
        bajas = 0;

        for (x = 1; x <= 10; x++) 
        {
            System.out.println("Ingrese Nota: ");
            nota = teclado.nextInt();
            if (nota >= 7) 
            {
                altas = altas + 1;
            } else {
                bajas = bajas + 1;
            }
        }

        System.out.println("Cantidad de alumnos con notas mayores o iguales a 7: " + altas);
        System.out.println("Cantidad de alumnos con notas menores: " + bajas);
    }
}

