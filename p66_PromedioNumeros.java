//p66_PromedioNumeros

import java.util.Scanner;

public class p66_PromedioNumeros {
    public static float Promedio (float num1, float num2, float num3) {
        float suma, prom;
        suma = num1 + num2 + num3;
        prom = suma/3;
        return prom;

    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner obj = new Scanner(System.in);
        System.out.println("Dados tres numeros flotantes, obtener su promedio");

        System.out.print("Dame número 1 : "); float num1 = obj.nextFloat();
        System.out.print("Dame número 2 : ");  float num2 = obj.nextFloat();
        System.out.print("Dame número 3 : "); float num3 = obj.nextFloat();

        float prom = Promedio(num1, num2 , num3);

        System.out.println("El promedio es " + prom);

        System.out.println("El promedio es " + Promedio(10, 10, 10));


    }
    
}

