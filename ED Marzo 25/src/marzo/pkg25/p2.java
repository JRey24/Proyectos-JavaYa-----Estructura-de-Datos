package marzo.pkg25;

import java.util.Scanner;

public class p2 {
    static int x[];
    static int tam;
    static Scanner teclado;
    
    public static void main(String[] args)
    {
        System.out.println("Digite el tamaño del arreglo");
        teclado=new Scanner(System.in);
        tam = teclado.nextInt();
        
        x = new int [tam];
        for(int i = 0; i<tam; i++)
            System.out.println(i+" "+x[i]);
    }
}
