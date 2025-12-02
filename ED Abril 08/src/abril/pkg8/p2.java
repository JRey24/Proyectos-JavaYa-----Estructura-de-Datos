package abril.pkg8;

import java.util.Scanner;

public class p2 {
    static int a[][],b[][],c[][];
    int tam;
    Scanner teclado=new Scanner(System.in);
    
    private void inicializar()
    {
        System.out.println("Digite tamaño: ");
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
                System.out.print("Digite m[" +fil+ "][" +col+ "]");
                m[fil][col]=teclado.nextInt();
            }
        }
    }
    
    void sumar(int[][] aa, int[][] bb, int[][] cc) {
        int fil,col;
        for(fil=0;fil<tam;fil++)
        {
            for(col=0;col<tam;col++)
            {
                cc[fil][col]= aa[fil][col]+ bb[fil][col];
            }
        }
    }
    public static void main(String[] args) 
    {
    p2 mat=new p2();
    mat.inicializar();
    System.out.println("Imprimir A");
    mat.imprimir(a);
    System.out.println("Imprimir B");
    mat.imprimir(b);
    
    System.out.println("Digite datos para la Matriz A");
    mat.cargar(a);
    System.out.println("Digite datos para la Matriz B");
    mat.cargar(b);  
    
    System.out.println("Imprimir A");
    mat.imprimir(a);
    System.out.println("Imprimir B");
    mat.imprimir(b);
    
    System.out.println(" Sumar matriz A + matriz B");
    mat.sumar(a,b,c);
    mat.imprimir(c);
    }    

}
