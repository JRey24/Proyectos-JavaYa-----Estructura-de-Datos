package marzo17;

import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, tam, edad, niños = 0, jovenes = 0, adultos = 0, viejos = 0;
        System.out.println("Cantidad de edades a ingresar: ");
        tam = teclado.nextInt();

        for (i = 0; i < tam; i++) {
            System.out.println("Ingrese su edad: ");
            edad = teclado.nextInt();

            if (edad >= 50) {
                System.out.println("Usted esta viejo, su edad es: " +edad+ " anos.");
                viejos++;
            } else if (edad >= 20) {
                System.out.println("Usted es adulto, su edad es: " +edad+ " anos.");
                adultos++;
            } else if (edad >= 12) {
                System.out.println("Usted es joven, su edad es: " +edad+ " años.");
                jovenes++;
            } else {
                System.out.println("Usted es un niño, su edad es: " +edad+ " años.");
                niños++;
            }
            }   
        System.out.println("Cantidad de niños: " +niños);
        System.out.println("Cantidad de jovenes: " +jovenes);
        System.out.println("Cantidad de adultos: " +adultos);
        System.out.println("Cantidad de viejos: " +viejos);
    }
}