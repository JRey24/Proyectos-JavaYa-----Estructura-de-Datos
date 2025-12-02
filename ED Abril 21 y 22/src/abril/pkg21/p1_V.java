package abril.pkg21;

import java.util.Scanner;

public class p1_V
{
    public static int x[][],y[][],tam,z;
    public static Scanner teclado;

    public void inicializar()
    {
        System.out.println("Digite el tamaño de la matriz");
        teclado=new Scanner(System.in);
        tam=teclado.nextInt();
        x=new int [tam][tam];
        y=new int [tam][tam]; // Inicializamos 'y' aquí también
    }

    public void imprimir(int[][] matriz) // Modificamos para que reciba la matriz a imprimir
    {
        int fil,col;
        for(fil=0;fil<tam;fil++)
        {
            for(col=0;col<tam;col++)
            {
                System.out.print(" "+matriz[fil][col]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void llenar()
    {
        int fil,col;
        for(fil=0;fil<tam;fil++)
        {
            for(col=0;col<tam;col++)
            {
                System.out.println("Digite el valor en x[ "+fil+" ][ "+col+" ]");
                x[fil][col]=teclado.nextInt();
            }
        }
    }

    public void transpuesta()
    {
        int i,j;
        for(i=0;i<x.length;i++)
        {
            for(j=0;j<x[0].length;j++)
            {
                y[j][i]=x[i][j];
            }
        }
    }

    public void determinante2x2()
    {
        if (tam == 2) {
            z=(x[0][0]*x[1][1])-(x[1][0]*x[0][1]);
            System.out.println("La determinante es: "+z);
        } else {
            System.out.println("La determinante solo se calcula para matrices de 2x2.");
        }
    }
    public static void main(String[] args)
    {
        p1_V p=new p1_V();
        p.inicializar();
        p.llenar();
        System.out.println("Matriz Original:");
        p.imprimir(x);
        p.transpuesta();
        System.out.println("Matriz Transpuesta:");
        p.imprimir(y); // Imprimimos la matriz transpuesta 'y' aquí
        p.determinante2x2();

    }

}