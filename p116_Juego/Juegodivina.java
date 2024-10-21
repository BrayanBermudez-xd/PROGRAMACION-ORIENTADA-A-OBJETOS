package p116_Juego;
import java.util.Scanner;
public class Juegodivina implements Juego {
    private int num,intentos;

    @Override
    public void Iniciar() {


        num = 1 + (int)(Math.random()*100);
        
    }
        

    @Override
    public void jugar() {

    int num=0;
    do {
        System.out.println("Dame un numero entre 1 y 100?"); num = new Scanner(System.in).nextInt();
        if(this.num < num) System.out.println("mas abajo..");
        else if(this.num > num) System.out.println("mas arriba");
        intentos++;
        
    } while (this.num != num);


        
        
    }
    @Override
    public void Finalizar() {
        System.out.println("lo lograste en tal intentos " + intentos);
    }
}