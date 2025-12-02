package ed.mayo.pkg12;

import java.util.Scanner;


public class Lista_N2 {

    static Nodo cab,p,nuevo;
    static Scanner teclado = new Scanner(System.in);
    
    Lista_N2 (int dato)
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
    public void sumar()
    {
        int suma = 0;
        Nodo actual = cab; // Empezamos desde la cabeza de la lista

        while (actual != null) {
            suma += actual.info; // Sumamos el valor del nodo actual
            actual = actual.sig; // Movemos al siguiente nodo
        }

        System.out.println("La suma de los elementos de la lista es: " + suma);
    }
    public void sumaparimp()
    {
        int sumaPares = 0;
        int sumaImpares = 0;
        Nodo actual = cab; // Empezamos desde la cabeza de la lista

        while (actual != null) {
            if (actual.info % 2 == 0) {
                sumaPares += actual.info; // Si el valor es par, lo sumamos a sumaPares
            } else {
                sumaImpares += actual.info; // Si el valor es impar, lo sumamos a sumaImpares
            }
            actual = actual.sig; // Movemos al siguiente nodo
        }

        System.out.println("La suma de los valores pares es: " + sumaPares);
        System.out.println("La suma de los valores impares es: " + sumaImpares);
    }
    public void modificar()
    {
        if (cab == null) {
            System.out.println("La lista está vacía. No hay nada que modificar.");
            return;
        }

        System.out.println("Digite el valor que desea modificar: ");
        int valorAntiguo = teclado.nextInt();
        System.out.println("Digite el nuevo valor: ");
        int valorNuevo = teclado.nextInt();

        Nodo actual = cab;
        boolean encontrado = false;

        while (actual != null) {
            if (actual.info == valorAntiguo) {
                actual.info = valorNuevo;
                encontrado = true;
                System.out.println("El valor " + valorAntiguo + " ha sido modificado a " + valorNuevo + ".");
                break; // Terminamos la búsqueda una vez que encontramos y modificamos el valor
            }
            actual = actual.sig; // Movemos al siguiente nodo
        }

        if (!encontrado) {
            System.out.println("El valor " + valorAntiguo + " no se encontró en la lista.");
        }
    }
    
    public static void main(String[] args) 
    {
        int valor;
        System.out.println("Digite valor a insertar: ");
        valor = teclado.nextInt();
        Lista_N2 l=new Lista_N2(valor);
        int op=0;
        do
        {
            System.out.println("");
            System.out.println(" LISTAS ");  
            System.out.println("1. INSERTAR LISTAS "); 
            System.out.println("2. RETIRAR ");
            System.out.println("3. IMPRIMIR ");
            System.out.println("4. SUMAR "); 
            System.out.println("5. SUMAR PARES E IMPARES ");
            System.out.println("6. MODIFICAR ");
            System.out.println("7. SALIR ");
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
                
                case 4:{
                        l.sumar();
                        break;
                        }
                case 5:{
                        l.sumaparimp();
                        break;
                        }
                case 6:{
                        l.modificar();
                        break;
                        }
            }
        }while(op!=7);
    }
}