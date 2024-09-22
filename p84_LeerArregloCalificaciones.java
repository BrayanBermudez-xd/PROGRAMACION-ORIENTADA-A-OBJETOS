//p84_LeerArregloCalificaciones - leer n calificaciones en un arreglo, calcular la suma y el promedio 

import java.util.Scanner;

public class p84_LeerArregloCalificaciones {
    public static void main(String[] args) {
        int n=0;
        float suma=0, promedio=0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println("Cuantas calificaciones "); n = obj.nextInt();

        float[] califis = new float[n];

        System.out.println("Introduce las  " + n + " calificaciones");
        for(int i=0; i<califis.length; i++) {
            System.out.println("Calificaciones ["+n+"] =");
            califis[i] = obj.nextFloat();

            System.out.println("las calificaciones capturadas son:");
            for(float cal : califis) {
                System.out.println( cal + " ");
                suma = suma + cal;
            }
            promedio = suma/ califis.length;
            System.out.println("\nla suma es "+ suma);
            System.out.println("\nel promedio es "+ promedio);
        }
    }
    
}
