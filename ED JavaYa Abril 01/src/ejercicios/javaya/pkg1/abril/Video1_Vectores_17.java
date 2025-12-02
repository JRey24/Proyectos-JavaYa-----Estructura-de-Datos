package ejercicios.javaya.pkg1.abril;

   import java.util.Scanner;

public class Video1_Vectores_17 {

    private Scanner teclado;
    private int[] vec;

    public void cargar() {
        teclado = new Scanner(System.in);
        System.out.print("Cuantos elementos desea que tenga el vector:");
        int n = teclado.nextInt();
        vec = new int[n];
        for (int f = 0; f < vec.length; f++) {
            System.out.print("Ingrese elementos:");
            vec[f] = teclado.nextInt();
        }
    }

    public void acumularElementos() {
        int suma = 0;
        for (int f = 0; f < vec.length; f++) {
            suma = suma + vec[f];
        }
        System.out.println("La suma de todos los elementos del vector es:" + suma);
    }

    public static void main(String[] ar) {
        Video1_Vectores_17 pv = new Video1_Vectores_17();
        pv.cargar();
        pv.acumularElementos();
    } 
}
