package p94_Empleado01;

//programa principal

public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(); // instanciar o rear objetos
        Empleado empleado2 = new Empleado(); // instanciar o rear objetos
        Empleado empleado3 = new Empleado(); // instanciar o rear objetos

        // asignar valores a las propiedades 
        empleado1.Nombre = "Juan Perez"; 
        empleado1.edad = 45;
        empleado2.Nombre = "Maria Lopez";
        empleado2.edad = 25;
        empleado3.Nombre = "jorge ";
        empleado3.edad = 1;

        System.out.print("\033[H\033[2J");
        System.out.println("Empleado 1 nombre :" + empleado1.Nombre);
        System.out.println("Empleado 1 edad   :" + empleado1.edad);
        System.out.println(empleado1.toString()); // invocar metodo toString() del objeto

        System.out.println("Empleado 2 nombre :" + empleado2.Nombre);
        System.out.println("Empleado 2 edad   :" + empleado2.edad);
        System.out.println(empleado2.toString());// invocar metodo toString() del objeto

        System.out.println("\nEmpleado 3");
        System.out.println(empleado3.toString());// invocar metodo toString() del objeto


    }
    
    
}
