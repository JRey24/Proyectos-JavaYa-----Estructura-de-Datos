package marzo11;

import java.util.Scanner;

public class p2 
{
    public static void main(String[] args) 
    {
        Scanner teclado=new Scanner(System.in);
        int i,n;
        System.out.println("Numero por elegir: ");
        n = teclado.nextInt();
        for(i=1; i<=n;i++)
            System.out.println(i+" ");
    } 
}