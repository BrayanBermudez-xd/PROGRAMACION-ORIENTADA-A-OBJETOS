
//p15_ConvertirEnDolares - Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares.

import java.util.Scanner;

public class p15_ConvertirADolares {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        double moneda, dollars;
        double precio = 18.99;

        System.out.println("\nCalculando el precio del dolar ");
        System.out.println("dime cuantos dinero quieres transformar en dolares");

        moneda = new Scanner(System.in).nextDouble();

        dollars = moneda / precio;

        System.out.println(String.format("El valor calculado de los dolares es el siguiente  : %.2f",dollars));


    }
    
}
