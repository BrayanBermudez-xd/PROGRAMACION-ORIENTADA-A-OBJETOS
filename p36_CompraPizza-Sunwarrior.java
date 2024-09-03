//p36_CompraPizza - Un usuario puede elegir un tamaño de pizza (chica - $5, mediana $10, grande $20), luego elige la cantidad, si la
//compra es menor a 2000 no tiene descuento, mayor a 2000 tiene un descuento de 15%. Diseñe un programa que
//permita procesar la solicitud e imprimir: tamaño de la compra, cantidad comprada, total compra, descuento, total de
//compra con descuento.

import java.util.Scanner;

public class p36_CompraPizza {
    public static void main(String[] args) {
        char Tamaño;
        Float CantCompra, subtotal, descuento, total, cantidad;
        Scanner obj = new Scanner(System.in);
        subtotal = descuento = total = (float) 0;

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Elije el tamaño de la pizza");
        System.out.println("[C]hica     -  $ 5");
        System.out.println("[M]ediana   -  $10 ");
        System.out.println("[G]rande    -  $20 ");
        System.out.print("Elije:");
        Tamaño = Character.toUpperCase( obj.next().charAt(0) );
        System.out.print("Elije la cantidad de pizzas: "); cantidad = new Scanner(System.in).nextFloat();

        switch (Tamaño) {
            case 'C': subtotal = (cantidad * 5);    break;
            case 'M': subtotal = (cantidad * 10);   break;   
            case 'G': subtotal = (cantidad * 20);   break;
            default: break;}

    if (subtotal > 2000){ 
        descuento = (float) 15.0 ;
        total = (float) (subtotal - (subtotal * 0.15));
    }

    System.out.printf("\nTamaño de la compra: "+ Tamaño +" \nCantidad de la compra: %.2f pizzas \nSubtotal de la compra: $ %.2f \nDescuento: $ %.2f \nTotal: $ %.2f", cantidad, subtotal, subtotal * 0.15, total);
}
}
