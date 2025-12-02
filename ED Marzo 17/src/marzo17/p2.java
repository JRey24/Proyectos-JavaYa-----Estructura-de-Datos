package marzo17;

import java.util.Scanner;

public class p2 {

    public static void main(String[] ar) 
    {
        Scanner teclado = new Scanner(System.in);

        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
        int x, y, n;

        System.out.print("Cuantos puntos se procesaran:");
        n = teclado.nextInt();

        for (int f = 1; f <= n; f++) {
            System.out.print("Ingrese la coordenada x:");
            x = teclado.nextInt();
            System.out.print("Ingrese la coordenada y:");
            y = teclado.nextInt();

            if (x > 0 && y > 0) {
                cont1++;
            } else {
                if (x < 0 && y > 0) {
                    cont2++;
                } else {
                    if (x < 0 && y < 0) {
                        cont3++;
                    } else {
                        if (x > 0 && y < 0) {
                            cont4++;
                        }
                    }
                }
            }
        }

        System.out.println("Cantidad de puntos ingresados en el primer cuadrante: " + cont1);
        System.out.println("Cantidad de puntos ingresados en el segundo cuadrante: " + cont2);
        System.out.println("Cantidad de puntos ingresados en el tercer cuadrante: " + cont3);
        System.out.println("Cantidad de puntos ingresados en el cuarto cuadrante: " + cont4);
    }
}

