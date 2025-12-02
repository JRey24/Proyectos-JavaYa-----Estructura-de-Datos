package ejercicios.javaya.pkg1.abril;

import java.util.Scanner;

public class Video1_Vectores_19 {

    private Scanner teclado;
    private int[] vec;
    private int menor;

    public void cargar() {
        teclado = new Scanner(System.in);
        System.out.print("Cuantos elementos tiene el vector:");
        int n = teclado.nextInt();
        vec = new int[n];
        for (int f = 0; f < vec.length; f++) {
            System.out.print("Ingrese elemento:");
            vec[f] = teclado.nextInt();
        }
    }

    public void menorElemento() {
        menor = vec[0];
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] < menor) {
                menor = vec[i];
            }
        }
        System.out.println("El elemento menor es:" + menor);
    }

    public void repiteMenor() {
        int cant = 0;
        for (int f = 0; f < vec.length; f++) {
            if (vec[f] == menor) {
                cant++;
            }
        }
        if (cant > 1) {
            System.out.println("El elemento menor se repite en el vector");
        } else {
            System.out.println("El elemento menor no se repite");
        }
    }

    public static void main(String[] ar) {
        Video1_Vectores_19 pv = new Video1_Vectores_19();
        pv.cargar();
        pv.menorElemento();
        pv.repiteMenor();
    }
}  