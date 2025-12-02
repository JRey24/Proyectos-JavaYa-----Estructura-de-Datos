package marzo.pkg18.parcial;

import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        int suma = 0;
        int temp = numero; // Usamos una variable temporal para no modificar el número original

        while (temp != 0) {
            int digito = temp % 10; // Obtiene el último dígito
            suma += digito; // Suma el dígito a la suma total
            temp /= 10; // Elimina el último dígito
        }

        System.out.println("La suma de los dígitos es: " + suma);
    }
}

