//p68_SumaRango

import java.util.Scanner;

public class p68_SumaRango {
    public static int SumaPromedio(int ini, int fin) {
        int suma=0;
        for(int i=ini; i <= fin ;i++)
        suma+=i;
        
        return suma;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        int suma = 0,ini,fin; 
        do {
            System.out.println("Dame el inicio ?"); ini = obj.nextInt();
            System.out.println("Dame wl fin    ?"); fin = obj.nextInt();
            
        } while (ini > fin );

        

    }           
}
