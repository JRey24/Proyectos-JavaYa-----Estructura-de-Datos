package parcial.Estructuradatos.whileafor;

import java.util.Scanner;

public class Video2_WHILE_a_FOR {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float altura, suma, promedio;
        int n;
        suma = 0;

        System.out.println("Ingrese la cantidad de personas:");
        n = teclado.nextInt();

        for (int x = 1; x <= n; x++) {
            System.out.println("Ingrese altura:");
            altura = teclado.nextFloat();
            suma = suma + altura;
        }

        promedio = suma / n;
        System.out.println("La altura promedio de las personas es: " + promedio);
    }
}