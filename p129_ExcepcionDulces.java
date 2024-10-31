import java.util.Scanner;
import java.util.InputMismatchException;


public class p129_ExcepcionDulces {
    public static void main(String[] args) {
        int niños;
        int dulcesExistentes;
        int dulcesParaCadaUno;


        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");


        try {
            System.out.println("Numero de los niños del barrio? "); niños = obj.nextInt();
            System.out.println("Cantidad de dulces existentes   "); dulcesExistentes = obj.nextInt();
            dulcesParaCadaUno = niños / dulcesExistentes;
            System.out.println("los dulces para cada niño es " + dulcesParaCadaUno);
            
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Los niños y los dulces deben de ser cantidades numericas ");
            System.out.println("Si no hay dulces, no se pueden repartir");
            
            
        }

    }    
}
