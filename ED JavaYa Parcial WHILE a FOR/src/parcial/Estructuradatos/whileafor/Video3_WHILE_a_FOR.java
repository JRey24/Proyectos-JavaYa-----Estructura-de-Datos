package parcial.Estructuradatos.whileafor;

import java.util.Scanner;

public class Video3_WHILE_a_FOR 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int cont1 = 0, cont2 = 0, n;
        float sueldo, gastos = 0;
        System.out.println("Cantidad de empleados");
        n = teclado.nextInt();

        for (int x = 1; x <= n; x++) 
        {
            System.out.println("Ingrese la cantidad del sueldo del empleado");
            sueldo = teclado.nextFloat();
            if (sueldo <= 300) 
            {
                cont1 = cont1 + 1;
            } else {
                cont2 = cont2 + 1;
            }
            gastos = gastos + sueldo;
        }

        System.out.println("cantidad de empleados con sueldo menor o igual a 300 " + cont1);
        System.out.println("Cantidad de empleados con sueldo mayor a 300 " + cont2);
        System.out.println("Gastos total en sueldos " + gastos);
    }
}