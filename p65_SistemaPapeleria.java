//p65_Sistema de papeleria


import java.util.Scanner;

public class p65_SistemaPapeleria {
    public static void main(String[] args) {
        char Tamaño, resp;
        int cantidad,venta, preciototal, carta, oficio, doble, cantcarta, cantoficio, cantdoble, fin, fin2;
        Scanner obj = new Scanner(System.in);
        venta=1;
        cantidad=preciototal=carta=oficio=doble= cantcarta= cantoficio=fin=fin2= cantdoble=0;
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("-------------------------------------");
        System.out.println("Papelería del papu brayan, SA. de CV.");
        System.out.println("Sistema de ventas");
        System.out.println("-------------------------------------");
        
        
        do {

        System.out.println("\nVenta: " + venta++);

        System.out.println("Escoge el tipó de carta!! ");
        System.out.println("[C]arta    -  $3");
        System.out.println("[O]ficio   -  $4 ");
        System.out.println("[D]oble    -  $6 ");
        System.out.print("Elije:");
        Tamaño = Character.toUpperCase( obj.next().charAt(0) );
        System.out.print("cuantas copias vas a querer ??: "); cantidad = new Scanner(System.in).nextInt();
            
        System.out.print("Deseas continuar (S/N)?");
        resp = Character.toUpperCase(obj.next().charAt(0));

        switch (Tamaño) {
            case 'C': cantcarta = cantidad;
                preciototal = (cantcarta  * 3 );
                carta = preciototal;
             break;
            case 'O': cantoficio = cantidad;
                preciototal= ( cantoficio  * 4); 
                oficio = preciototal;
            break;   
            case 'D': cantdoble = cantidad;
                preciototal = (cantdoble  * 6);
                doble = preciototal;
            break;
            default: break;}

    
        } while (resp != 'N');
        System.out.println("\n===========================================");
        System.out.println("Resumen diario de ventas ");
        System.out.println("\n===========================================");
        System.out.println("\nVentas realizadas : "+ (venta - 1));


        System.out.println("=============================================");
        System.out.printf ("\ncarta        :%d - $%d",cantcarta, carta );
        System.out.printf ("\noficio       :%d - $%d",cantoficio, oficio );
        System.out.printf ("\ndoble        :%d - $%d",cantdoble, doble );
        System.out.println("\n=============================================");

        fin = carta + oficio + doble;
        fin2 = cantcarta+cantoficio+cantdoble;

        System.out.printf("total ventas :%d - $%d",fin2,fin);

        if (fin < 50) {
            System.out.println("\nVenta moderada");
        } else if (fin >= 50 && fin <= 100) {
            System.out.println("\nVenta frecuente");
        } else {
            System.out.println("\nVenta superada");
        }

        obj.close();
    }
}






