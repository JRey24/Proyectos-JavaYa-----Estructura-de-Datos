package marzo10;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) 
    {
        Scanner teclado=new Scanner(System.in);
        int i, tam;
        System.out.println("Digite el tamaño: ");
        tam=teclado.nextInt();
        i = tam;
        while (i >=0)
        {
            System.out.println(" "+i);
            i=i-1;
        }
    }
}
