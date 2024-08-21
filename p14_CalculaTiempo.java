//p14_CalculaTiempo - Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos, considerando que >

import java.util.Scanner;

public class p14_CalculaTiempo {
    public static void main(String[] args) {
        double dia, hora, min, seg;
        Scanner obj = new Scanner(System.in);
    
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Calculando dias, minutos, segundos");

        System.out.println("dame la hora : "); hora = obj.nextDouble();

        
        dia = hora / 24; 
        min =  hora *60;
        seg =  hora * 360;

        System.out.println(String.format("el dia es : %.2f, la hora es : %.2f los minutos son : %.2f y los segundos : %.2f ", dia, hora, min, seg));

    }
    
}
