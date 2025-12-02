package marzo.pkg18.parcial;

import java.util.Scanner;

public class Marzo18Parcial {

    public static void main(String[] args) {
        
    
        Scanner teclado=new Scanner(System.in);
        int n,tam,p,r,i,num;
        int sumTInv=0;
        int sumTotalnum=0;
        System.out.println("Digite la cantidad de numero que va a probar: ");
        tam=teclado.nextInt();
        p = 0;
        
        for(i=1;i<=tam;i++)
        {    
            System.out.println("Digite el numero de su eleccion: ");
            n=teclado.nextInt();
            num=n;
            p=0;
            while (n!=0)
            {
               r=n%10;
               p=(p*10)+r;
               n=n/10;
            }  
            System.out.println("El inverso es: "+p);
            sumTInv += p;
            
            int suma=0; 
            int temp=num;
            while (temp != 0) 
            {
                int digito = temp % 10;
                suma += digito;
                temp /= 10;
            }
            System.out.println("La suma de los digitos es: " + suma);
            sumTotalnum += suma;
        }
        System.out.println("La suma total de los inversos es: " + sumTInv);
        System.out.println("La suma total de los digitos de los numeros ingresados es: " + sumTotalnum);
    }   
}
