//p04_PagaTrabajador

/**
 * p04_PagaTrabajador
 */

import java.util.Scanner;

 public class p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagaruta, paganeta;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalculando la paga del trabajador");

        System.out.println("Nombre del trabajador : "); nombre = obj.nextLine();
        System.out.println("Horas trabajadas      :"); horas = obj.nextInt();
        System.out.println("paga por hora         :"); paga = obj.nextFloat();
        tasa = 0.03;

        pagaruta = horas * paga;
        impuesto = pagaruta * tasa;
        paganeta = pagaruta - impuesto;

        System.out.println(String.format("El trabajador %s trabajo %d horas con una paga de %f y una tasa de %f",nombre,horas,paga,tasa));
        System.out.println(String.format("paga bruta  : %.2f", pagaruta));
        System.out.println(String.format("impuesto  : %.2f", impuesto));
        System.out.println(String.format("paga neta  : %.2f", paganeta));
    }

    
}