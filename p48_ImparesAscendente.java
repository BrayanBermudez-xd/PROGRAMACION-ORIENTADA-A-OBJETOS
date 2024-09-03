//p48_ImparesAscendente -  Se desea imprimir los números impares de forma ascendente desde 1 hasta el número que el usuario decida (n),
//además deberá imprimirse la suma y el promedio de esos números impares. El proceso debe de poder repetirse
//hasta que el usuario lo decida.

import java.util.Scanner;

public class p48_ImparesAscendente {
    public static void main(String[] args) {
        int c, n, s;
        char resp;

        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            c=1;
            n=s=0;

            System.out.println("Hasta donde deseas que lleguen los numeros impares  ? ");
            n = obj.nextInt();


            
        } while (c >= n);
            System.out.printf("%d ",c);
            s += c;
            c += 2;
            System.out.printf("\nLa suma de los pares hasta %d es %d ",n,s);

    }       
    
}
