package abril.pkg8;

import java.util.Scanner;

public class p1 
{
    int m[][];
    int tam;
    Scanner teclado=new Scanner(System.in);
    
    private void inicializar()
    {
        System.out.println("Digite tamaño: ");
        tam=teclado.nextInt();
        m=new int[tam][tam];
    }
    private void imprimir()
    {
        int fil,col;
        for(fil=0;fil<tam;fil++)
        {
            for(col=0;col<tam;col++)
            {
                System.out.print("  " +m[fil][col]);
            }
        System.out.println("");
        }
    }
    
    public static void main(String[] args) 
    {
    p1 mat=new p1();
    mat.inicializar();
    mat.imprimir();
    }
}
