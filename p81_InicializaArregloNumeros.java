//p81_InicializaArregloNumeros - 



public class p81_InicializaArregloNumeros {
    public static void main(String[] args) {
        double[] nums = new double[7];
        nums[0] = 5.0;
        nums[1] = 10.0;
        nums[2] = 15.5;
        nums[3] = 20.5;
        nums[4] = 25.0;
        nums[5] = 100.22;
        nums[6] = 90.0;  //Si ponemos la posicion 7 no existe por que el arreglo se ha llenado entonces saldran datos incoherentes xd 

        System.out.print("\033[H\033[2J");
        System.out.println("El primer elemento " + nums[0]);
        System.out.println("El ultimo elemento " + nums[6]);

        //Si ponemos uno pero con nums[7] no se puede por que esta fuera de rango 

        System.out.println("Todos los elementos del arreglo con un for en base al indice ");
        for (int i=0; i<nums.length; i++)
            System.out.println(nums[i]+ "");


        System.out.println("Todos los elementos del arreglo con un for sin indice ");
        for(double i : nums )
            System.out.println(i + " ");



        System.out.println("Todo ha terminado papu Gracias por usar el sistema papu........");
    }
    
}
