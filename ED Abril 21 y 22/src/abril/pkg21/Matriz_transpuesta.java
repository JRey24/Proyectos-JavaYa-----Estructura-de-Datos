package abril.pkg21;

import java.util.Scanner;

public class Matriz_transpuesta {
   
   static int a[][];
   int b[][];
   int tam;
   Scanner teclado=new Scanner(System.in);
    
    public void inicializar()
    {
        System.out.println("Digite el tamaño de la Matriz: ");
        tam=teclado.nextInt();
        a=new int[tam][tam];
        b=new int[tam][tam]; 

    }
    void imprimir(int matriz[][])
    {
        int fil,col;
        for(fil=0;fil<tam;fil++)
        {
            for(col=0;col<tam;col++)
            {
                System.out.print("  ["+matriz[fil][col]+"] ");
            }
        System.out.println("");
        }
    }
    public void cargar()
    {
        int fil,col;
        for(fil=0;fil<tam;fil++)
        {
            for(col=0;col<tam;col++)
            {
                System.out.println("Digite x["+fil+"]["+col+"]: ");
                a[fil][col]=teclado.nextInt();
            }

        }
    }  
     
    public void transponerMatriz()
    {
        b = new int[tam][tam];
        for(int i=0; i<tam; i++)
        {
            for(int j=0; j<tam; j++)
            {
                b[j][i] = a[i][j];
            }
        }   
    }
   public static void main(String[] args) 
   {
       Matriz_transpuesta mt=new Matriz_transpuesta();
       mt.inicializar();
       mt.imprimir(a);
       mt.cargar();
       System.out.println("Matriz Original: ");
       mt.imprimir(a);
       mt.transponerMatriz();
       System.out.println("Matriz Transpuesta: ");
       mt.imprimir(mt.b);
   }
}
