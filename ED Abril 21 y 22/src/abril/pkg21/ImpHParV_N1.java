package abril.pkg21;

import java.util.Scanner;

public class ImpHParV_N1 {

    static int a[][];
    int tam;
    Scanner teclado = new Scanner(System.in);

    public void inicializar() {
        System.out.println("Digite el tamaño de la Matriz: ");
        tam = teclado.nextInt();
        a = new int[tam][tam];
        llenarAutomatico(); // Llamamos al método para llenar la matriz automáticamente
    }

    void llenarAutomatico() {
        if (tam % 2 != 0) { // Si el tamaño es impar
            for (int i = 0; i < tam; i++) {
                for (int j = 0; j < tam; j++) {
                    a[i][j] = i + 1; // Llenar cada fila con su número (1-based)
                }
            }
        } else { // Si el tamaño es par
            for (int j = 0; j < tam; j++) {
                for (int i = 0; i < tam; i++) {
                    a[i][j] = j + 1; // Llenar cada columna con su número (1-based)
                }
            }
        }
    }

    void imprimir() {
        int fil, col;
        for (fil = 0; fil < tam; fil++) {
            for (col = 0; col < tam; col++) {
                System.out.print("  [" + a[fil][col] + "] ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        ImpHParV_N1 mt = new ImpHParV_N1();
        mt.inicializar();
        mt.imprimir();
    }
}