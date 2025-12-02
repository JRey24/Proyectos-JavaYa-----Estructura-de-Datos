package ejercicios.javaya.taller;

import java.util.Scanner;

public class Video1_Vectores_22 {
    private Scanner teclado;
    private int[][] mat;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        mat=new int[2][5];
        System.out.println("Carga de la matriz por columna:");
        for(int c=0;c<5;c++) {        
           for(int f=0;f<2;f++) {
                System.out.print("Ingrese componente " + " de la fila " + f + " y la columna "+ c + " :");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void imprimir() {
        for(int f=0;f<2;f++) {
            for(int c=0;c<5;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] ar) {
        Video1_Vectores_22 pv=new Video1_Vectores_22();
        pv.cargar();
        pv.imprimir();
    }   
}
