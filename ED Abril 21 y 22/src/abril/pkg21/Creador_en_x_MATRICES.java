package abril.pkg21;

import java.util.Scanner;

public class Creador_en_x_MATRICES {
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
          void llenarDiagonales() {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == j || i + j == tam - 1) {
                    a[i][j] = tam; 
                } else {
                    a[i][j] = 0;
                }
            }
        }
    }
        public static void main(String[] args) 
   {
       Creador_en_x_MATRICES mt=new Creador_en_x_MATRICES();
       mt.inicializar();
       System.out.println("Matriz Vacia");
       mt.imprimir();
       mt.llenarDiagonales();
       System.out.println("Matriz con datos llenos:");
       mt.imprimir();
    }
}