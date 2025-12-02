package ejercicios.javaya.pkg1.abril;

import java.util.Scanner;

public class JavaYa_EjemploProblema_Vectores19 {
  
    private Scanner teclado;
    private String[] nombres;
    private float[] sueldos;

    public void cargar() {
        teclado=new Scanner(System.in);
        nombres=new String[5];
        sueldos=new float[5];
        for(int f=0;f<nombres.length;f++) {
            System.out.print("Ingrese el nombre del empleado:");
            nombres[f]=teclado.next();
            System.out.print("Ingrese el sueldo:");
            sueldos[f]=teclado.nextFloat();
        }
    }
    
    public void mayorSueldo() {
        float mayor;
        int pos;
        mayor=sueldos[0];
        pos=0;
        for(int f=1;f<nombres.length;f++) {
            if (sueldos[f]>mayor) {
                mayor=sueldos[f];
                pos=f;
            }
        }
        System.out.println("El empleado con sueldo mayor es "+nombres[pos]);
        System.out.println("Tiene un sueldo:"+mayor);
    }
    
    public static void main(String[] ar) {
        JavaYa_EjemploProblema_Vectores19 jy=new JavaYa_EjemploProblema_Vectores19();
        jy.cargar();
        jy.mayorSueldo();
    } 
}
