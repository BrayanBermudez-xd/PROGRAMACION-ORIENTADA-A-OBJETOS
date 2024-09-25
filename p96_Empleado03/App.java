package p96_Empleado03;

public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan perez",  25);
        Empleado empleado2 = new Empleado("nepomuseno", 1);
        Empleado empleado3 = new Empleado();

        empleado3.setNombre("jorge");
        empleado3.setEdad(2);
        
        System.out.print("\033[H\033[2J");

        System.out.println("Empleado 1 " + empleado1.toString());

        
    }
    

    
}
