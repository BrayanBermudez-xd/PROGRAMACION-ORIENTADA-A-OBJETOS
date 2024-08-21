// p11_CalcularAngulo - se desea calcular el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo, usando la siguiente formula:

import java.util.Scanner;

public class p11_CalcularAngulo {
    public static void main(String[] args) {
        
        double angulo1, angulo2, angulo3;
        Scanner obj = new Scanner(System.in);
    
        System.out.print("\033[H\033[2J"); System.out.flush();


        System.out.println("Calculando angulo...");
        System.out.println("Dame el primer angulo  : "); angulo1 = obj.nextDouble();
        System.out.println("Dame el segundo angulo :");  angulo2 = obj.nextDouble();

        angulo3 = 180 - (angulo1 + angulo2);

        System.out.println(String.format("\nEl angulo primero es : %.2f, el segundo angulo es : %.2f el angulo final es de : %.2f" , angulo1,angulo2,angulo3));


    }
}
