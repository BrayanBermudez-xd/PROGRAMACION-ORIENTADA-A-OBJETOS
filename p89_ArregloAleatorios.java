//p89_ArregloAleatorios

import java.util.Random;
import java.util.random.*;

public class p89_ArregloAleatorios {

    public static void Mostrar(float[] x){
        for(int i=0; i<x.length; i++)
        System.out.println(x[i] + " ");
        System.out.println();

    }
    public static void GenerarAleatoris(float[] x) {
        float min = 1.5f, max=10.5f;
        for (int i = 0; i < x.length; i++) {
            x[i] = new Random().nextFloat(max - min + 1) + min;   
        }
        
    }
    public static void main(String[] args) {
        int MAX = 15; 
        float []f1 = new float[MAX];
        float [] f2= new float[MAX];

        System.out.print("\033[H\033[2J");
        GenerarAleatoris(f1);
        GenerarAleatoris(f2);
        System.out.println(" arreglos de numeros aleatroio");
        Mostrar(f1);
        Mostrar(f2);
        
    }
    
}
