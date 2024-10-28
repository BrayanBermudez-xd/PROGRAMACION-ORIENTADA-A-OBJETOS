

import java.util.Scanner;

public class p122_Excepcion2 {
    public static void main(String[] args) {
        


        System.out.print("\033[H\033[2J");
        
        try {
            System.out.println(" dame un valor ??");
            int val = new Scanner(System.in).nextInt();
            val = val + 5;
            System.out.println("el nuevo valor es " + val);
            
        } catch (Exception e) {// Aqui ponemos los mensajes personalizados 
            System.out.println("No friegues debes de ponerle un numero papu");
            
            
        }
        System.out.println("el mundo sigue xd no sea simp.....");
    }
}
