package previa.taller.ejercicios.marzo.pkg31;

import java.util.Scanner;

public class p3 
{
    static int x[],tam,i;
    static Scanner teclado =new Scanner(System.in);
    
    public void inicio()
    {
        System.out.println("Digite tamaño del arreglo: ");
        tam=teclado.nextInt();
        x=new int[tam];
    }
            
    public void imprimir()
    {
        for (i=0;i<tam;i++)
        {
            System.out.print(""+x[i]);
            System.out.print(" ");
        }
    }
    
    public void cargar()
    {
        System.out.println(" ");
        for (i=0;i<tam;i++)
        {
            System.out.println("Digite el contenido de la posicion x[" +i+ "]: ");
            x[i] = teclado.nextInt();
            while (x[i] < 2 || x[i] > 4) 
        {
            System.out.println("No se permite el dato " + x[i] + ". Solo números entre 2 a 4");
            System.out.print("Ingrese un nuevo dato: ");
            x[i] = teclado.nextInt();
        }
        
        System.out.println("Dato aceptado: " + x[i]);
        }
    }
    public void contador()
    {
        int cuatro=0, tres=0, dos=0;
        for (i = 0; i < tam; i++) 
        { 

        if (x[i] == 2){
            dos++;
        }else if (x[i] == 3){
                tres++;
            }else if (x[i] == 4){
                cuatro++;
            }
        }
        System.out.println("Cantidad de 2: " + dos);
        System.out.println("Cantidad de 3: " + tres);
        System.out.println("Cantidad de 4: " + cuatro);
    }
    
    public static void main(String[] args) 
    {
        p3 p=new p3();
        p.inicio();
        p.imprimir();
        p.cargar();
        p.contador();
    }
}
