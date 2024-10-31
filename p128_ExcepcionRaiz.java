import java.util.Scanner;
import java.util.InputMismatchException;

public class p128_ExcepcionRaiz {

    public static void main(String[] args) {
        
        float numero;
        double total;

        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        
        try {
            System.out.println("Dame un numero que le quieras sacar una raiz cuadrada"); numero = obj. nextFloat();
    
            total = Math.sqrt(numero);
    
            System.out.printf("la raiz cuadrada de %.2f es %.2f ", numero,total);
            
        } catch (InputMismatchException e) {
            System.out.println("se tienen que colocar numeros xd");
        }
    }
}