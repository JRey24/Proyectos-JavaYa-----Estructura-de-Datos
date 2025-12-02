package taller.codigos.para.ss;

import java.util.Scanner;

public class Matriz_Magica {

    public static void main(String[] args) {
        int[][] matriz3x3 = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };

        int[][] matriz4x4 = {
                {16, 2, 3, 13},
                {5, 11, 10, 8},
                {9, 7, 6, 12},
                {4, 14, 15, 1}
        };

        int[][] matriz5x5 = {
                {17, 24, 1, 8, 15},
                {23, 5, 7, 14, 16},
                {4, 6, 13, 20, 22},
                {10, 12, 19, 21, 3},
                {11, 18, 25, 2, 9}
        };

        int[][] matriz6x6 = {
                {35, 26, 1, 19, 6, 24},
                {8, 17, 28, 10, 33, 15},
                {3, 21, 32, 23, 7, 25},
                {30, 12, 5, 14, 34, 16},
                {31, 22, 9, 27, 2, 20},
                {4, 13, 36, 18, 29, 11}
        };

        int[][] matriz7x7 = {
                {30, 39, 48, 1, 10, 19, 28},
                {38, 47, 7, 9, 18, 27, 29 },
                {46, 6, 8, 17, 26, 35, 37 },
                {5, 14, 16, 25, 34, 36, 45},
                {13, 15, 24, 33, 42, 44, 4},
                {21, 23, 32, 41, 43, 3, 12},
                {22, 31, 40, 49, 2, 11, 20}
        };

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa el nombre de la matriz que deseas analizar (matriz3x3, matriz4x4, etc.): ");
        String palabraClave = teclado.nextLine();
        teclado.close();

        switch (palabraClave) {
            case "matriz3x3":
                System.out.println("Matriz 3x3:");
                imprimirMatriz(matriz3x3);
                System.out.println("Suma de las filas:");
                sumaFilas(matriz3x3);
                System.out.println("Suma de las columnas:");
                sumaColumnas(matriz3x3);
                sumaDiagonalPrincipal(matriz3x3);
                sumaDiagonalSecundaria(matriz3x3);
                break;
            case "matriz4x4":
                System.out.println("Matriz 4x4:");
                imprimirMatriz(matriz4x4);
                System.out.println("Suma de las filas:");
                sumaFilas(matriz4x4);
                System.out.println("Suma de las columnas:");
                sumaColumnas(matriz4x4);
                sumaDiagonalPrincipal(matriz4x4);
                sumaDiagonalSecundaria(matriz4x4);
                break;
            case "matriz5x5":
                System.out.println("Matriz 5x5:");
                imprimirMatriz(matriz5x5);
                System.out.println("Suma de las filas:");
                sumaFilas(matriz5x5);
                System.out.println("\nSuma de las columnas:");
                sumaColumnas(matriz5x5);
                sumaDiagonalPrincipal(matriz5x5);
                sumaDiagonalSecundaria(matriz5x5);
                break;
            case "matriz6x6":
                System.out.println("Matriz 6x6:");
                imprimirMatriz(matriz6x6);
                System.out.println("Suma de las filas:");
                sumaFilas(matriz6x6);
                System.out.println("Suma de las columnas:");
                sumaColumnas(matriz6x6);
                sumaDiagonalPrincipal(matriz6x6);
                sumaDiagonalSecundaria(matriz6x6);
                break;
            case "matriz7x7":
                System.out.println("Matriz 7x7:");
                imprimirMatriz(matriz7x7);
                System.out.println("Suma de las filas:");
                sumaFilas(matriz7x7);
                System.out.println("Suma de las columnas:");
                sumaColumnas(matriz7x7);
                sumaDiagonalPrincipal(matriz7x7);
                sumaDiagonalSecundaria(matriz7x7);
                break;
            default:
                System.out.println("La palabra clave ingresada no coincide con el nombre de ninguna matriz.");
                break;
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void sumaFilas(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
        }
    }

    static void sumaColumnas(int[][] matriz) {
        if (matriz.length == 0) {
            return;
        }
        for (int j = 0; j < matriz[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
        }
    }

    static void sumaDiagonalPrincipal(int[][] matriz) {
        if (matriz.length != matriz[0].length) {
            System.out.println("La matriz no es cuadrada, no se puede calcular la diagonal principal.");
            return;
        }
        int sumaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][i];
        }
        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
    }


    static void sumaDiagonalSecundaria(int[][] matriz) {
        if (matriz.length != matriz[0].length) {
            System.out.println("La matriz no es cuadrada, no se puede calcular la diagonal secundaria.");
            return;
        }
        int sumaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][matriz.length - 1 - i];
        }
        System.out.println("Suma de la diagonal secundaria: " + sumaDiagonal);
    }
}