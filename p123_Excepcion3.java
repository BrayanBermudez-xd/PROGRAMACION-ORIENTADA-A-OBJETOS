import java.util.InputMismatchException;
import java.util.Scanner;
// este va modificado con dos catch

public class p123_Excepcion3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        
        try {
            System.out.println("valor del numerador ");int a = obj.nextInt();
            System.out.println("valor del dominador ");int b = obj.nextInt();
    
            int c = a/b;
            System.out.println(" el resultado de la division es " + c);
            
        } catch (InputMismatchException| ArithmeticException e) {
            System.out.println("tanto el numerador como el denominador deben ser numeros");
            System.out.println("NO se pude dividir entre 0");
        }

    }
}

