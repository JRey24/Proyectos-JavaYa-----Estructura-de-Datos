package ed.abril.pkg28.y.pkg29;

import java.util.Scanner;


public class MatrizMitad_IzqaDerecha {

        static int a[][];
    int tam;
    Scanner teclado=new Scanner(System.in);

        public void inicializar()
    {
        System.out.println("Digite el tamaño de la Matriz: ");
        tam=teclado.nextInt();
        a=new int[tam][tam];

    }
        void imprimir()
    {
        int fil,col;
        for(fil=0;fil<tam;fil++)
        {
            for(col=0;col<tam;col++)
            {
                System.out.print("  ["+a[fil][col]+"] ");
            }
        System.out.println("");
        }
    }
          void llenarespacios() {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == j) {
                    a[i][j] = 1; 
                }
                else if (i > j) { 
                    a[i][j] = 1;
                } else { 
                    a[i][j] = 0; 
                }
            }
        }
    }
        
        public static void main(String[] args) 
   {
       MatrizMitad_IzqaDerecha mt=new MatrizMitad_IzqaDerecha();
       mt.inicializar();
       System.out.println("Matriz Vacia");
       mt.imprimir();
       mt.llenarespacios();
       System.out.println("Matriz con datos llenos:");
       mt.imprimir();
    }    
    
}
