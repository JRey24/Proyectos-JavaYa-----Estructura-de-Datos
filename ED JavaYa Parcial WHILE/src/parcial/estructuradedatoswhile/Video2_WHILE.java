package parcial.estructuradedatoswhile;

    import java.util.Scanner;

public class Video2_WHILE 
{
    public static void main(String [] args)
    {
     Scanner teclado=new Scanner(System.in);
     float altura,suma,promedio;
     int x,n;
     suma=0;
     x=1;
     System.out.println("Ingrese la cantidad de personas:");
     n=teclado.nextInt();

     while(x<=n)
     {
        System.out.println("Ingrese altura:");
        altura=teclado.nextFloat();
        suma=suma+altura;
        x=x+1;
     }
     promedio=suma/n;
     System.out.println("La altura promedio de las personas son:"+promedio);
    }
}

