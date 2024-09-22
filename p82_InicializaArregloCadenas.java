//p82_InicializaArregloCadenas - 


public class p82_InicializaArregloCadenas {
    public static void main(String[] args) {
        String[] muns = new String[10];
        muns[0] = "Apozol";
        muns[1] = "Apulco";
        muns[2] = "cañitas";
        muns[3] = "Jerez";
        muns[4] = "Fresnillo";
        muns[5] = "Rio Grande ";
        muns[6] = "sain Alto"; 
        muns[7] = "Sombrete";
        muns[8] = "Teul de Gonzales Ortega";
        muns[9] = "Sombrete";
        // el muns[10] no existe si no causaria un error 

        System.out.print("\033[H\033[2J");
        System.out.println("\nEl primer elemento " + muns[0]);
        System.out.println("El ultimo elemento " + muns[9]);

        //Si ponemos uno pero con nums[7] no se puede por que esta fuera de rango 

        System.out.println("Todos los elementos del arreglo con un for en base al indice ");
        for (int i=0; i<muns.length; i++)
            System.out.println(muns[i]+ "");


        System.out.println("Todos los elementos del arreglo con un for sin indice ");
        for(String m : muns )
            System.out.println(m + " ");



        System.out.println("Todo ha terminado papu Gracias por usar el sistema papu........");
    
    }
    
}
    

