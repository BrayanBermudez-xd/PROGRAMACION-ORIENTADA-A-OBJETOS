//p13_VolumenCilindro - Se desea sacar el volumen de un cilindro atarvez de la formula siguiente:
import java.util.Scanner;

public class p13_VolumenCilindro {
    public static void main(String[] args) {
        double radio, volumen, altura;
        Scanner obj = new Scanner(System.in);
    
        System.out.print("\033[H\033[2J"); System.out.flush();


        System.out.println("Calculando el volumen");
        System.out.println("Dame el radio : "); radio = obj.nextDouble();
        System.out.println("Dame la altura :"); altura = obj .nextDouble();

        volumen = Math.PI * (radio * radio) * altura;

        System.out.println(String.format("el radio es : %.2f y la altura es : %.2f y el volumen es : %.2f", radio, altura, volumen ));
        
        
    }
}
