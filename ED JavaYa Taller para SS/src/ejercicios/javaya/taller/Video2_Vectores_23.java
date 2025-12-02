package ejercicios.javaya.taller;

import java.util.Scanner;

public class Video2_Vectores_23 {
    
    private Scanner teclado;
    private int[][] mat;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        mat=new int[filas][columnas];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
           
    public void imprimirVertices() {
    	System.out.println("Vértice superior izquierdo:");
        System.out.println(mat[0][0]);
    	System.out.println("Vértice superior derecho:");        
        System.out.println(mat[0][mat[0].length-1]);
    	System.out.println("Vértice inferior izquierdo:");        
        System.out.println(mat[mat.length-1][0]);
    	System.out.println("Vértice inferior derecho:");        
        System.out.println(mat[mat.length-1][mat[mat.length-1].length-1]);
    }    
    
    public static void main(String[] ar) {
        Video2_Vectores_23 pv=new Video2_Vectores_23();
        pv.cargar();
        pv.imprimirVertices();
    }   
}
