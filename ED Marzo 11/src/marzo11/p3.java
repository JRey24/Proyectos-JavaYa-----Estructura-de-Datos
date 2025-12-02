package marzo11;

import java.util.Scanner;

public class p3 
{
    public static void main(String[] args) 
    {
        Scanner teclado=new Scanner(System.in);
        int i,n;
        System.out.println("Numero por elegir: ");
        n = teclado.nextInt();
        for(i=n; i>=0;i=i-1)
            System.out.print(i+" ");
    } 
}
