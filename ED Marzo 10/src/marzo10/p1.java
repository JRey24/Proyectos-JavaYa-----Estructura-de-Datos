package marzo10;

import java.util.Scanner;

public class p1 {

    public static void main(String[] args) 
    {
        Scanner teclado=new Scanner(System.in);
        int i, tam;
        System.out.println("Digite el tamaño: ");
        tam=teclado.nextInt();
        i = 1;
        while (i <=tam)
        {
            System.out.println(" "+i);
            i=i+1;
        }
    }  
}
