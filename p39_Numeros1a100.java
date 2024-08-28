//p39_Numeros1a100 - imprimir numeros de 1 a 100 con while 

import java. util.Scanner;

public class p39_Numeros1a100 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("imprimiendo de 1 a n");
        System.out.print("hasta donde       ? "); int n =  new Scanner(System.in).nextInt();
        System.out.print("En incrementos de ? "); int i =  new Scanner(System.in).nextInt();

        int c = 0;
        while (c <= n) {
            System.out.printf("Chilaquiles %d\n",c);
            c = c + i;            
        }
    

        System.out.println("\n El ciclo ha terminado ");
        System.out.print(c);
    }
    
}
