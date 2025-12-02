package ed.mayo.pkg13;

import java.util.Scanner;

public class Cola_Previa {

        static Nodo cab,p,q,nuevo;
        static Scanner teclado=new Scanner(System.in);
        
        Cola_Previa()
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
       int valor;
        Cola_Previa l =new Cola_Previa();
        int op=0;
        do
        {
            System.out.println("");
            System.out.println(" Menu de Inicio ");  
            System.out.println("1. Insertar Valor "); 
            System.out.println("2. Retirar Valor ");
            System.out.println("3. Imprimir Valor ");
            System.out.println("4. Salir ");
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
                
                case 3:{
                        l.imprimir();
                        break;}
            }
        }while(op!=4);
    }
}