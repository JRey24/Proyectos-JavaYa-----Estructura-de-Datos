package abril.pkg21;

import java.util.Scanner;

public class Determinante {
   
    int[][] matrizOriginal;
    int tam;
    Scanner teclado=new Scanner(System.in);

    public void inicializar()
    {
        System.out.print("Digite el tamaño de la matriz: ");
        tam=teclado.nextInt();

        if(tam>=2)
        {
            matrizOriginal=new int[tam][tam];
        }
        else 
            System.out.println("Tamaño no válido.");
    }

    public void cargar(int m[][])
    {
        for(int i=0;i<tam;i++)
        {
            for(int j=0;j<tam;j++)
            {
                System.out.print("Digite m["+i+"]["+j+"]: ");
                m[i][j]=teclado.nextInt();
            }
        }
    }


    public void imprimir(int m[][])
    {
        for(int i=0;i<tam;i++)
        {
            for(int j=0;j<tam;j++)
            {
                System.out.printf("%4d",m[i][j]);
            }
            System.out.println();
        }
    }

    public int det(int[][] m,int n)
    {
        int det=0;

        if(n==2)
            det=m[0][0]*m[1][1]-m[0][1]*m[1][0];
        else
            if(n==3)
        {
            det=(m[0][0]*m[1][1]*m[2][2])+(m[0][1]*m[1][2]*m[2][0])+(m[0][2]*m[1][0]*m[2][1])
                -(m[0][2]*m[1][1]*m[2][0])-(m[0][0]*m[1][2]*m[2][1])-(m[0][1]*m[1][0]*m[2][2]);
        } 
            else
                if(n==4)
                {
                    det=0;
                    for(int col=0;col<4;col++)
                    {
                        int[][] menor=new int[3][3];

                        for(int i=1;i<4;i++)
                        {
                            int colMenor=0;

                            for(int j=0;j<4;j++)
                            {
                                if(j!=col)
                                {
                                    menor[i-1][colMenor]=m[i][j];
                                    colMenor++;
                                }
                            }
                        }
                        int signo=(col%2==0)?1:-1;
                        det=det+(signo*m[0][col])*det(menor,3);
                    }
                    return det;
                }
                else
                    System.out.println("Cálculo de determinante no implementado para matrices mayores a 4x4.");
                return det;
    }

    public void proceso()
    {
        if(tam>=2)
        {
            System.out.println("Cargar valores en la matriz:");
            cargar(matrizOriginal);
            imprimir(matrizOriginal);
            
            if(tam<=4)
            {
                int determinante=det(matrizOriginal,tam);
                System.out.println("Determinante de la matriz: "+determinante);
            }
            else
                System.out.println("No se calcula determinante para matrices mayores a 4x4.");
        }
    }

    public static void main(String[] args)
    {
        Determinante m = new Determinante();
        m.inicializar();
        m.proceso();
    } 
} 

