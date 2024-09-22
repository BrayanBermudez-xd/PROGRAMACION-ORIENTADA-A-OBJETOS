//p85_NombresEdades - 

import java.util.Scanner;

public class p85_NombresEdades {
    public static void main(String[] args) {
        int n=0, s=0, p=0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println("Cuantos elemntos deseas procesar ? ");n = obj.nextInt();

        String[] nombres = new String[n];
        int[] edades = new int[n];

        System.out.println("dame los nombres y edades de los "+ n + " elementos" );
        for (int i = 0; i < edades.length; i++) {
            obj.nextLine();
            System.out.println("Nombre    ="); nombres[i] = obj.nextLine();
            System.out.println("Edades    ="); edades[i] = obj.nextInt();


        }
        System.out.println("Los nombres y edades capturados son :");
        for (int i = 0; i < edades.length; i++) {
            System.out.println(nombres[i] + " - " + edades[i]);
            s = s + edades[i];

        }
        p = s / n;
        System.out.println("\n El promedio de eades es " + p);
    }
    
}
 