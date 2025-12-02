package ejercicios.javaya.pkg1.abril;

import java.util.Scanner;

public class JavaYa_EjemploProblema_Vectores17 {

    static public Scanner teclado;
    static public int[] sueldos;
	
    public void cargar()
    {
        teclado=new Scanner(System.in);
        System.out.print("Cuantos sueldos cargará:");
        int cant;
        cant=teclado.nextInt();
        sueldos=new int[cant];
        for(int f=0;f<sueldos.length;f++) {
            System.out.print("Ingrese sueldo:");
            sueldos[f]=teclado.nextInt();
        }	
    }
	
    public void imprimir() {
        for(int f=0;f<sueldos.length;f++) {
            System.out.println(sueldos[f]);
        }
    }
	
    public static void main(String[] ar) {
        JavaYa_EjemploProblema_Vectores17 jy=new JavaYa_EjemploProblema_Vectores17();
        jy.cargar();
        jy.imprimir();
    }
}
