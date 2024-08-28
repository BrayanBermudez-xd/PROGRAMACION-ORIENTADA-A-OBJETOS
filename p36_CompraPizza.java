//p36_CompraPizza - Un usuario puede elegir un tamaño de pizza (chica - $5, mediana $10, grande $20), luego elige la cantidad, si la
//compra es menor a 2000 no tiene descuento, mayor a 2000 tiene un descuento de 15%. Diseñe un programa que
//permita procesar la solicitud e imprimir: tamaño de la compra, cantidad comprada, total compra, descuento, total de
//compra con descuento.

import java.util.Scanner;

public class p36_CompraPizza {
    public static void main(String[] args) {
        char est;
        float cant, total, descuento, res;
        
        Scanner obj = new Scanner(System.in);


        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Elijan el tamaño de la pizza\n");
        System.out.println(" Estacionamiento [C]hica $5");
        System.out.println(" Estacionamiento [M]ediana $10");
        System.out.println(" Estacionamiento [G]rande %20");
        System.out.print("Elige opción ? "); est =obj.next().charAt(0);

        System.out.println("cuantas pizzas quieres ?"); cant = new Scanner(System.in).nextFloat();

        est = Character.toUpperCase(obj.next().charAt(0));
        descuento = (float)0.15;

        switch (est) {
            case 'C' : total = 5 * cant ; 
            if (total < 2000) {
                System.out.println(String.format("el precio es de %f", total));
            }
            if (total > 2000) {
                res = total * descuento ;
                System.out.println("como el precio es mayor a 2000 entonces se le aplica el siguiente descuento" + res);
            }
        
            case 'M' : total = 10 * cant ; 
            if (total < 2000) {
                System.out.println(String.format("el precio es de %f", total));

                        
            }
            
            case 'G' : total = 20 * cant; 
            if (total < 2000) {
                System.out.println(String.format("el precio es de %f", total));

           
            }

                
        
            default:
            System.out.println("se te enfrian tus chilaquiles xd");
                break;
        }
        
    }
}
