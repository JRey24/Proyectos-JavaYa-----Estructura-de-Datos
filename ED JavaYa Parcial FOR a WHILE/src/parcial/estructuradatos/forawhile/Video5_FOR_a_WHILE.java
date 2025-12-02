package parcial.estructuradatos.forawhile;

import java.util.Scanner;

public class Video5_FOR_a_WHILE 
{
    
    public static void main(String[] ar) 
    {
        Scanner teclado = new Scanner(System.in);
        int cont1 = 0, cont2 = 0, cont3 = 0;
        int n, lado1, lado2, lado3;

        System.out.print("Cuantos triangulos quiere procesar:");
        n = teclado.nextInt();

        int f = 1;
        while (f <= n) 
        {
            System.out.print("Ingrese el primer valor del lado del triangulo:");
            lado1 = teclado.nextInt();

            System.out.print("Ingrese el segundo valor del lado del triangulo:");
            lado2 = teclado.nextInt();

            System.out.print("Ingrese el tercer valor del lado del triangulo:");
            lado3 = teclado.nextInt();

            if (lado1 == lado2 && lado1 == lado3) 
            {
                System.out.println("Triangulo equilatero");
                cont1++;
            } else {
                if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) 
                {
                    cont2++;
                    System.out.println("Triangulo isosceles");
                } else {
                    cont3++;
                    System.out.println("Triangulo escaleno");
                }
            }
            f++;
        }

        System.out.println("Cantidad de triangulos equilateros: " + cont1);
        System.out.println("Cantidad de triangulos isosceles: " + cont2);
        System.out.println("Cantidad de triangulos escalenos: " + cont3);

        if (cont1 < cont2 && cont1 < cont3) 
        {
            System.out.print("Menor cantidad de triangulos ingresados: Equilatero");
        } else {
            if (cont2 < cont3) 
            {
                System.out.print("Menor cantidad de triangulos ingresados: Isosceles");
            } else {
                System.out.print("Menor cantidad de triangulos ingresados: Escaleno");
            }
        }
    }
}
