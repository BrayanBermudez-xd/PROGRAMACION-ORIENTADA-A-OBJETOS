//p26_TipoAngulo - Determina el tipo de angulo en base a su magnitud

import java.util.Scanner;

public class p26_TipoAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\n Dame un numero entre 0 y 360 grados y te dire su tipo ?");
        int angulo = new Scanner(System.in).nextInt();

        if(angulo<0 || angulo>360) {
            System.out.println("De cual fumaste ...");
        }else {
            System.out.print("El tipo de angulo es : ");
            if(angulo < 90) System.out.println("Agudo");
            if(angulo ==90) System.out.println("Recto");
            if(angulo > 90 && angulo <180) System.out.println("Obtuso");
            if(angulo == 180) System.out.println("llano");
            if(angulo > 180 &&  angulo < 360) System.out.println("Concavo");
            if(angulo == 360) System.out.println("completo");

        }

        System.out.println("Ya casi te estas ganando una torta de lomo del coemdor ");


        
    }
    
}
