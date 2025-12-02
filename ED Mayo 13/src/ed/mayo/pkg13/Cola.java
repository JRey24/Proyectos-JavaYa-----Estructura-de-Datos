package ed.mayo.pkg13;

import java.util.Scanner;

public class Cola 
{
        static Nodo cab,p,q,nuevo;
        static Scanner teclado=new Scanner(System.in);
        
        Cola()
        {
            cab=new Nodo(-999, null);
            cab.sig=cab;
        }
        
        void insertar(int dato)
        {
            nuevo=new Nodo(dato,null);
            nuevo.sig=cab.sig;
            cab.sig=nuevo;
            cab=nuevo;
        }
        
        void imprimir()
        {
                q=cab.sig;
                p=q.sig;
                while(p!=q)
                {
                    System.out.print(" "+p.info);
                    p=p.sig;
                }  
                System.out.println();

        }
        
        void retirar()
        {
            q=cab.sig;
            p=q.sig;
            q.sig=p.sig;
            if (q==q.sig)
                cab=q;

        }
        
    public static void main(String[] args) 
    {
        Cola l =new Cola();
        l.insertar(5);
        l.insertar(3);
        l.insertar(1);
        l.imprimir();
        System.out.println("");
        l.retirar();
        l.imprimir();
        System.out.println("");
        l.retirar();
        l.imprimir();
        System.out.println("");
        l.retirar();
        l.imprimir();
        System.out.println("");

    }
    
}
