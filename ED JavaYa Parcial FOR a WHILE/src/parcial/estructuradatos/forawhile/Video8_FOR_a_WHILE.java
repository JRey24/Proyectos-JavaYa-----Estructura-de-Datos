package parcial.estructuradatos.forawhile;

import java.util.Scanner;

public class Video8_FOR_a_WHILE 
{

    public static void main(String[] ar) 
    {
        Scanner teclado = new Scanner(System.in);

        int suma1 = 0;
        int edad;
        int f = 1; 

        System.out.println("Ingrese edades del turno mañana");
        while (f <= 50) 
        {
            System.out.print("Ingrese edad:");
            edad = teclado.nextInt();
            suma1 = suma1 + edad;
            f++; 
        }

        int suma2 = 0;
        f = 1; 

        System.out.println("Ingrese edades del turno tarde");
        while (f <= 60) 
        {
            System.out.print("Ingrese edad:");
            edad = teclado.nextInt();
            suma2 = suma2 + edad;
            f++; 
        }

        int suma3 = 0;
        f = 1; 
        System.out.println("Ingrese edades del turno noche");
        while (f <= 110) 
        {
            System.out.print("Ingrese edad:");
            edad = teclado.nextInt();
            suma3 = suma3 + edad;
            f++; 
        }

        int promedio1 = suma1 / 50;
        System.out.println("Promedio de edades del turno mañana: " + promedio1);

        int promedio2 = suma2 / 60;
        System.out.println("Promedio de edades del turno tarde: " + promedio2);

        int promedio3 = suma3 / 110;
        System.out.println("Promedio de edades del turno noche: " + promedio3);

        if (promedio1 < promedio2 && promedio1 < promedio3) 
        {
            System.out.print("Turno mañana menor promedio");
        } else {
            if (promedio2 < promedio3) 
            {
                System.out.print("Turno tarde menor promedio");
            } else {
                System.out.print("Turno noche menor promedio");
            }
        }
    }
}