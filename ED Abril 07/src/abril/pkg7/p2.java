package abril.pkg7;

import java.util.Scanner;

public class p2 
{
    public static Scanner teclado=new Scanner(System.in);
    public static int tam;

    public static int x[][];
    
    public void imprimir()
    {
        int fil,col;
        for(fil=0;fil<tam;fil++)
        {
            for(col=0;col<tam;col++)
            {
                System.out.print("  " +x[fil][col]);
            }
        System.out.println("");
        }
    }  
    
    public void inicializar()
    {
        System.out.println("Digite el tamaño");
        tam=teclado.nextInt();
        x= new int[tam][tam];
    }
    public void cargar()
    {
        int fil,col;
        for(fil=0;fil<tam;fil++)
        {
            for(col=0;col<tam;col++)
            {
                System.out.println("Digite x["+fil+"]["+col+"]: ");
                x[fil][col]=teclado.nextInt();
            }

        }
    }  
     
    public static void main(String[] args) 
    {
        p2 p=new p2();
        p.inicializar();
        p.imprimir();
        p.cargar();
        p.imprimir();
    }
}
