//p21_VerificarNumero - verifica si un numero es negativo, positivo o cero

import java.util.Scanner;


public class p21_VerificarNumero {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); 
        
        System.out.println("Verificamos si un numero es positivo, negativo o cero");
        System.out.println("Dame un numero entero");
        int numero = new Scanner(System.in).nextInt();

        if(numero>0) System.out.println("El numero " + numero + "  es positivo");
        if(numero<0) System.out.println("El numero " + numero + " es negativo");
        if(numero==0) System.out.println("El numero " + numero + " es cero");

    }
    
}
