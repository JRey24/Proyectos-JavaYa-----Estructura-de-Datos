package abril.pkg1;

import java.util.Scanner;

public class palindromo2 {
    
    static public Scanner teclado;
    static String cadena;
    static int tam;
    
    public static void cargarcadena()
    {
        teclado=new Scanner(System.in);
        cadena=teclado.nextLine();
        System.out.println(cadena);
        
        tam= cadena.length();
        System.out.println(tam);
    }
    
    public static void palindromo()
    {
        int i,k;
        i=0;
        k=tam-1;
        boolean resultado=true;
        while(i<k)
        {
            if(cadena.charAt(i) == cadena.charAt(k))
            {
                i++;
                k--;
            }
            else
            {
                i=k;
                resultado=false;
            }
        }
        if (resultado==true)
            System.out.println("Es palindromo");
        else
            System.out.println("No es palindromo");
    }
    
    public static void main(String[] args) 
    {
        cargarcadena();
        palindromo();
    }
}
