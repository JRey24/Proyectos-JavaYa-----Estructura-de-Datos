package abril.pkg7;

import java.util.Scanner;

public class p1{

public static Scanner teclado=new Scanner(System.in);
public static int tam;

public static int x[][]={
    {5,8,7},
    {9,11,9},
    {59,85,79}
    };

public void imprimir()
{
    tam=3;
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
    public static void main(String[] args) 
    {
    p1 p=new p1();
    p.imprimir();
    }
}
