package ed.mayo.pkg12;

import java.util.Scanner;

public class Lista 
{
    static Nodo cab,p,nuevo;
    static Scanner teclado = new Scanner(System.in);
    
    Lista (int dato)
    {
        cab = new Nodo (dato,null);
    }
    
    static void insertar(int dato)
    {
        nuevo = new Nodo(dato,null);
        nuevo.sig = cab;
        cab = nuevo;
    }
    static void retirar()
    {
        if(cab==null)
            System.out.println("No hay datos a retirar");
        else
            cab=cab.sig;
    }
    public void imprimir()
    {
        p=cab;
        while(p!=null)
        {
            System.out.print("  " +p.info);
            p=p.sig;
        }
    }
    
    public static void main(String[] args) 
    {
        int valor;
        System.out.println("Digite valor a insertar: ");
        valor = teclado.nextInt();
        Lista l=new Lista(valor);
        int op=0;
        do
        {
            System.out.println("");
            System.out.println(" LISTAS ");  
            System.out.println("1. INSERTAR LISTAS "); 
            System.out.println("2. RETIRAR ");
            System.out.println("3. IMPRIMIR ");
            System.out.println("4. SALIR "); 
            System.out.println(" Digite opcion "); 
            op = teclado.nextInt();
            
            switch(op)
            {
                case 1:{
                        System.out.println("Digite valor a insertar: ");
                        valor = teclado.nextInt();
                        l.insertar(valor);
                        break;
                        }
                
                case 2:{
                        l.retirar();
                        break;
                        }
                
                case 3:{l.imprimir();break;}
            }
        }while(op!=4);
    }
}