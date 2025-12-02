package ejercicios.javaya.taller;

import java.util.Scanner;

public class JavaYa_EjemploProblema2_Vectores22 
{
    private Scanner teclado;
    private int[][] mat;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        mat=new int[4][4];
        for(int f=0;f<4;f++) {
            for(int c=0;c<4;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void imprimirDiagonalPrincipal() {
        for(int k=0;k<4;k++) {
            System.out.print(mat[k][k]+" ");
        }
    }
    
    public static void main(String[] ar) {
        JavaYa_EjemploProblema2_Vectores22 jy=new JavaYa_EjemploProblema2_Vectores22();
        jy.cargar();
        jy.imprimirDiagonalPrincipal();
    }   
}