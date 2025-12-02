package ejercicios.javaya.taller;

import java.util.Scanner;

public class JavaYa_EjemploProblema1_Vectores22 {
    private Scanner teclado;
    private int[][] mat;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        mat=new int[3][5];
        for(int f=0;f<3;f++) {
            for(int c=0;c<5;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void imprimir() {
        for(int f=0;f<3;f++) {
            for(int c=0;c<5;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] ar) {
        JavaYa_EjemploProblema1_Vectores22 jy=new JavaYa_EjemploProblema1_Vectores22();
        jy.cargar();
        jy.imprimir();
    }   
}
