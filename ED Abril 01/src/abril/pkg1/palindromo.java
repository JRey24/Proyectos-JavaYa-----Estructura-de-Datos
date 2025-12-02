package abril.pkg1;

import java.util.Scanner;

public class palindromo {
    
    static public Scanner teclado;
    static String cadena;

    public static void main(String[] args) {
        teclado=new Scanner(System.in);
        String cadena;
        cadena=teclado.nextLine();
        System.out.println(cadena);
        
        int tam= cadena.length();
        System.out.println(tam);
    }
    
}
