package ejercicios.javaya.pkg1.abril;

import java.util.Scanner;

public class Video1_Vectores_20 {
    
    private Scanner teclado;
    private int[] vec;
	
     public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantos elementos tendrá el vector:");
         int cant;
        cant=teclado.nextInt();
        vec=new int[cant];
	    for(int f=0;f<vec.length;f++) {
            System.out.print("Ingrese elemento:");
            vec[f]=teclado.nextInt();
	    }
	}
	
    public void ordenar() {
        for(int k=0;k<vec.length;k++) {
            for(int f=0;f<vec.length-1-k;f++) {
                if (vec[f]>vec[f+1]) {
                    int aux;
                    aux=vec[f];
                    vec[f]=vec[f+1];
                    vec[f+1]=aux;
                }
            }
        }
    }
	
    public void imprimir() {
	    System.out.println("Vector ordenados de menor a mayor.");
        for(int f=0;f<vec.length;f++) {
            System.out.println(vec[f]);
        }
    }
	
    public static void main(String[] ar) {
        Video1_Vectores_20 pv=new Video1_Vectores_20();
        pv.cargar();
        pv.ordenar();
        pv.imprimir();
    }

}
