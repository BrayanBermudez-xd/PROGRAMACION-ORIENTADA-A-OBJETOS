//p25_EstacionesAño - manda un mensaje en base a numero de gestacion del año

import java.util.Scanner;


public class p25_EstacionesAño {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\nDame un numero entre 1 y 4 y te dire que estacion del año es :");
        int n = new Scanner(System.in).nextInt();
    
        if(n>=1 && n<=4) {
            System.out.println("xd ");
            if(n==1) System.out.println("\nPrimavera");
            if(n==2) System.out.println("\nVerano");
            if(n==3) System.out.println("\nOtoño");
            if(n==4) System.out.println("\nInvierno");

        } else
            System.out.println("eres un pendejo");

        System.out.println("\n vamonoooooooos al comedor KAKAROTOOO!!");
    
    }
    
}
