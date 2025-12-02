package marzo10;

import java.util.Scanner;

public class p5 {
      public static void main(String[] args) 
    {
        Scanner teclado=new Scanner(System.in);
        int num,tam,p,r;
        System.out.println("Digite el tamaño: ");
        tam=teclado.nextInt();
        num=tam;
        p = 0;
        while (num!=0)
        {
           r=num%10;
           p=(p*10)+r;
           num=num/10;
        }  
        System.out.println("El inverso es: "+p);
    }
}
