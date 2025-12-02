package parcial.estructuradatos.forawhile;

import java.util.Scanner;

public class Video1_FOR_a_WHILE {

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        int cantidad = 0;
        int n,base,altura,superficie;

        System.out.print("Cantidad de triangulos:");
        n = teclado.nextInt();

        int f = 1;
        while (f <= n) {
            System.out.print("Ingrese base:");
            base = teclado.nextInt();
            System.out.print("Ingrese la altura:");
            altura = teclado.nextInt();
            superficie = base * altura / 2;
            System.out.println("Superficie:" + superficie);
            if (superficie > 12) {
                cantidad++;
            }
            f++;
        }
        System.out.print("Cantidad de triangulos con superficie mayor a 12:" + cantidad);
    }
}