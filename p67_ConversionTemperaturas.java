//p67_ConversionTemperaturas

import java.util.Scanner;

public class p67_ConversionTemperaturas {


    public static float CaF(float temp) {
        return (temp * 9.0f / 5.0f) + 32;
        
    }
    public static float FaC(float temp) {
        return (temp - 32) * 5.0f / 9.0f;
        
    }
    public static void main(String[] args) {
        int op;
        Scanner obj = new Scanner(System.in);
        do {
            
        
            System.out.print("\033[H\033[2J"); System.out.flush();

            System.out.println("Conversion de temperatura");
            System.out.println("1. C a F/n2 F a C/n3. salir ");
            System.out.println("Elije ? "); op = obj.nextInt();

            switch (op) {
                case 1: System.out.println("convertir de C a F ");
                        System.out.println("Dame la temperatura ? "); float temp = obj.nextFloat();
                        System.out.println("el resultado es : " + CaF(temp));
                    break;

                case 2 : System.out.println("convertir de F a C");
                        System.out.println("Dame la temperatura ? "); temp = obj.nextFloat();
                        System.out.println("el resultado es : " + FaC(temp));
                    break;
                
                case 3: System.out.println("\nGracias por utilizar este programa");
                    break;
            
                default:
                    break;
            }
            System.out.println("gracias papu");
        } while (op!= 3);
    }
}
