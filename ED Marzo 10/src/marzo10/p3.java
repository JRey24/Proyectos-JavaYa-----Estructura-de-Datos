package marzo10;

import java.util.Scanner;

public class p3 {
  public static void main(String[] args) 
    {
        Scanner teclado=new Scanner(System.in);
        int i, tam,p;
        System.out.println("Digite el valor a multiplicar: ");
        tam=teclado.nextInt();
        i = 1;
        while (i <=10)
        {
            p=i*tam;
            System.out.println(" "+tam+" * "+i+" = " +p);
            i=i+1;
        }  
    }
}
