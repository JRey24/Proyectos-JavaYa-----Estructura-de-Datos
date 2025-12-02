package parcial.estructuradatos.forawhile;

import java.util.Scanner;

public class Video4_FOR_a_WHILE {

    public static void main(String[] ar) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un valor entre 1 y 10 para que se muestre la tabla de multiplicar:");
        int numero = teclado.nextInt();
        
        int f = 1;
        while (f <= 13) 
        {
            int termino = f * numero;
            System.out.println(f + " * " + numero + " = " + termino);
            f++; 
        }
    }
}

