package marzo10;

import java.util.Scanner;

public class p4 {
      public static void main(String[] args) 
    {
        Scanner teclado=new Scanner(System.in);
        int i, tam,p,sum;
        System.out.println("Digite el valor a multiplicar: ");
        tam=teclado.nextInt();
        i = 1;
        sum=0;
        while (i <=10)
        {
            p=i*tam;
            sum=sum+p;
            System.out.println(" "+tam+" * "+i+" = " +p+ " La sumatoria es: "+sum);
            i=i+1;
        }  
    }
}
