package taller.codigos.para.ss;

import java.util.Scanner;

public class Multiplicacion_de_Matrices 
{
    static int a[][],b[][],c[][];
    int tam;
    Scanner teclado=new Scanner(System.in);
    
    private void inicializar()
    {
        System.out.println("Digite el tamaño de la Matriz: ");
        tam=teclado.nextInt();
        a=new int[tam][tam];
        b=new int[tam][tam];
        c=new int[tam][tam];
    }
    void imprimir(int [][]m)
    {
        int fil,col;
        for(fil=0;fil<tam;fil++)
        {
            for(col=0;col<tam;col++)
            {
                System.out.print("  [" +m[fil][col]+"] ");
            }
        System.out.println("");
        }
    }
    
    void cargar(int [][] m)
    {
        int fil,col;
        for(fil=0;fil<tam;fil++)
        {
            for(col=0;col<tam;col++)
            {
                System.out.print("Digite m[" +fil+ "][" +col+ "]: ");
                m[fil][col]=teclado.nextInt();
            }
        }
    }
    
    void multiplicar(int[][] a, int[][] b, int[][] c) {
        int fil, col, k;
        for (fil = 0; fil < tam; fil++) 
        {
            for (col = 0; col < tam; col++) 
            {
                c[fil][col] = 0;
                for (k = 0; k < tam; k++) {
                    c[fil][col] += a[fil][k] * b[k][col];
                }
            } 
        }   
    }
    
    
    public static void main(String[] args) 
    {
    Multiplicacion_de_Matrices mdm=new Multiplicacion_de_Matrices();
    mdm.inicializar();
    System.out.println("Imprimir A");
    mdm.imprimir(a);
    System.out.println("Imprimir B");
    mdm.imprimir(b);
    
    System.out.println("");
    
    System.out.println("Digite datos para la Matriz A");
    mdm.cargar(a);
    
    System.out.println("");
    
    System.out.println("Digite datos para la Matriz B");
    mdm.cargar(b);
    
    System.out.println("Imprimir A");
    mdm.imprimir(a);
    System.out.println("Imprimir B");
    mdm.imprimir(b);
    
    System.out.println("Multiplicar matriz A * matriz B");
    mdm.multiplicar(a,b,c);
    mdm.imprimir(c);
    }    
}