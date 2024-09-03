//p32_PagoEstacionamiento - Administra el pago por estacionamiento de acuerdo a la Zona

import java.util.Scanner;

public class p32_PagoEstacionamiento {
    public static void main(String[] args) {
        char est;
        float pago, total, imp;

        pago = total= imp = 0;
    
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Elijan el tipo de estacionanmiento que Usaste\n");
        System.out.println(" Estacionamiento [N]orte 3%");
        System.out.println(" Estacionamiento [s]ur 5%");
        System.out.println(" Estacionamiento [E]ste 10%");
        System.out.println(" Estacionamiento [O]este 20%");
        System.out.print("Elige opción ? "); est =obj.next().charAt(0);

        est = Character.toUpperCase(obj.next().charAt(0));
        switch (est) {
            case 'N' : imp = 0.03f; break;
            case 'S' : imp = 0.05f; break;
            case 'E' : imp = 0.10f; break;
            case 'O' : imp = 0.20f; break;

                
        
            default:
                break;
        }

        System.out.println("cuanto pagaste ? ");
        pago = obj.nextFloat();

        total= pago * (1 + imp);
        System.out.println("xd");

    }



}
