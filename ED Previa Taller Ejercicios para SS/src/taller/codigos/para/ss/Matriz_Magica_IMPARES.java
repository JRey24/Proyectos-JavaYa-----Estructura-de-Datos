package taller.codigos.para.ss;

import java.util.Scanner;

public class Matriz_Magica_IMPARES {
    static int[][] a; // Declaración de la matriz como estática para poder usarla en main
    int tam;
    Scanner teclado = new Scanner(System.in);

    private void inicializar() {
        System.out.println("Digite el tamaño de la Matriz mágica (debe ser un número impar): ");
        tam = teclado.nextInt();
        // Verificamos que el tamaño sea impar, ya que el algoritmo que usaremos es para cuadrados mágicos de orden impar
        if (tam % 2 == 0) {
            System.out.println("El tamaño debe ser un número impar para generar un cuadrado mágico con este método.");
            // Podríamos salir del programa o pedir un nuevo tamaño, por ahora simplemente se inicializará con un cuadrado vacío.
            a = new int[tam][tam];
        } else {
            a = new int[tam][tam];
            llenarCuadradoMagicoImpar(); // Llamamos al método para llenar la matriz mágicamente
        }
    }

    // Nuevo método para llenar la matriz con un cuadrado mágico de orden impar (método siamés)
    private void llenarCuadradoMagicoImpar() {
        int num = 1;
        int fila = 0;
        int columna = tam / 2;

        while (num <= tam * tam) {
            a[fila][columna] = num++;
            int siguienteFila = (fila - 1 + tam) % tam;
            int siguienteColumna = (columna + 1) % tam;

            if (a[siguienteFila][siguienteColumna] == 0) {
                fila = siguienteFila;
                columna = siguienteColumna;
            } else {
                fila = (fila + 1) % tam;
            }
        }
    }

    void imprimir() {
        int fil, col;
        System.out.println("Cuadrado Mágico de orden " + tam + ":");
        for (fil = 0; fil < tam; fil++) {
            for (col = 0; col < tam; col++) {
                System.out.printf("%-4d", a[fil][col]);
            }
            System.out.println("");
        }
        verificarCuadradoMagico(); // Agregamos la verificación al imprimir
    }

    // Nuevo método para verificar si la matriz es un cuadrado mágico
    private void verificarCuadradoMagico() {
        int constanteMagica = tam * (tam * tam + 1) / 2;
        int sumaFila, sumaColumna, sumaDiagonalPrincipal = 0, sumaDiagonalSecundaria = 0;
        boolean esMagico = true;

        // Verificar suma de filas
        for (int i = 0; i < tam; i++) {
            sumaFila = 0;
            for (int j = 0; j < tam; j++) {
                sumaFila += a[i][j];
            }
            if (sumaFila != constanteMagica) {
                esMagico = false;
                break;
            }
        }

        // Verificar suma de columnas
        if (esMagico) {
            for (int j = 0; j < tam; j++) {
                sumaColumna = 0;
                for (int i = 0; i < tam; i++) {
                    sumaColumna += a[i][j];
                }
                if (sumaColumna != constanteMagica) {
                    esMagico = false;
                    break;
                }
            }
        }

        // Verificar suma de la diagonal principal
        if (esMagico) {
            for (int i = 0; i < tam; i++) {
                sumaDiagonalPrincipal += a[i][i];
            }
            if (sumaDiagonalPrincipal != constanteMagica) {
                esMagico = false;
            }
        }

        // Verificar suma de la diagonal secundaria
        if (esMagico) {
            for (int i = 0; i < tam; i++) {
                sumaDiagonalSecundaria += a[i][tam - 1 - i];
            }
            if (sumaDiagonalSecundaria != constanteMagica) {
                esMagico = false;
            }
        }

        if (esMagico) {
            System.out.println("La matriz es un cuadrado mágico. La constante mágica es: " + constanteMagica);
        } else {
            System.out.println("La matriz NO es un cuadrado mágico.");
        }
    }

    public static void main(String[] args) {
        Matriz_Magica_IMPARES mm = new Matriz_Magica_IMPARES();
        mm.inicializar();
        mm.imprimir();
    }
}