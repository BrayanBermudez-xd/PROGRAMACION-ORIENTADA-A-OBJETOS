//p10_HipotenusaTriangulo - Se desea calcular la hipotenusa de un trinagulo rectangulo dadas las longitudes
// de sus lados ,usando las siguiente formula:

import java.util.Scanner;


public class p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        Double long1, long2, hipotenusa;
        Scanner obj = new Scanner(System.in);
    
        System.out.print("\033[H\033[2J"); System.out.flush(); // Borrar pantalla de la consola


        System.out.println("Calculando la hipotenusa");
       
       
        System.err.println("Dame la longitud del primer lado  :"); long1 = obj.nextDouble();
        System.err.println("Dame la longitud del segundo lado :"); long2 = obj.nextDouble();

        hipotenusa = Math.sqrt((long1 * long1) + (long2 * long2));

        System.out.print("\nPara un trinagulo de longitud 1, " + long1 + " y longitud 2, " + long2 + " su hipotenusa es :" + hipotenusa );
        System.out.println(String.format("\npara un triangulo de longitud 1, %.2f y longitud de 2, %.2f su hipotenusa es : %.2f " ,long1 ,long2 ,hipotenusa));

    }
}
