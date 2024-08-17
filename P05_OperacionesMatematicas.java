//P05_OperacionesMatematicas


public class P05_OperacionesMatematicas {
    public static void main(String[] args) {
        double x, y, suma, resta, mult, div, res, pot;

        x = 10.5;
        y = 2.5;

        suma = x + y;
        resta = x -y;
        mult = x * y;
        div = x / y;
        res = x % y;
        pot = Math.pow(x, y);

        System.out.println(String.format("los numeros son %.2f , %.2f", x,y));
        System.out.println(String.format("la suma es                    :%.2f", suma));
        System.out.println(String.format("la resta es                   :%.2f", resta));
        System.out.println(String.format("la multiplicacion es          :%.2f", mult));
        System.out.println(String.format("la division es                :%.2f", div));
        System.out.println(String.format("la residuo es                 :%.2f", res));
        System.out.println(String.format("la potencia es                :%.2f", pot));
        
    }
   
   
    
}
