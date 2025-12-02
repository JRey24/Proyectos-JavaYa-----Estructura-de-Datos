package abril.pkg7;

import java.util.Scanner;

public class p3
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
        public void paresimpares ()
    {
        int fil,col;
        int pares =0;
        int impares =0;
        
        for(fil=0;fil<tam;fil++)
        {
            for(col=0;col<tam;col++)
            {
                if (x[fil][col] % 2 == 0) 
                {
                    pares = pares + 1;
                } 
                else 
                {
                    impares = impares + 1;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }
    public static void main(String[] args) 
    {
        p3 p=new p3();
        p.inicializar();
        p.imprimir();
        p.cargar();
        p.imprimir();
        p.paresimpares();
    } 
}