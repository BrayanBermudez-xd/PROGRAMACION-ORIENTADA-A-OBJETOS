//p12_ConvertirTemperatura - Se desea convertir una temperatura de grados fahrenheit a grados celsius, usando la siguiente formula:

import java.util.Scanner;

public class p12_ConvertirTemperatura {
        public static void main(String[] args) {
            double farenheit, celsius;

            Scanner obj = new Scanner(System.in);
    
            System.out.print("\033[H\033[2J"); System.out.flush();

            System.out.println("Calculando los grados ");
            System.out.println("Dame los grados farentheit : "); farenheit = obj.nextDouble();

            celsius = (farenheit - 32) * (5.0/9.0);

            System.out.println(String.format("los grados farenheit son : %.2f y los grados celsius ya convertidos son : %.2f", farenheit, celsius));




        }
}



