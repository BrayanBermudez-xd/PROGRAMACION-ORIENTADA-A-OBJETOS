package p96_Empleado03;

public class Empleado {
    //propiedades
    private String Nombre;
    private int edad;

    //constructor es un metodo publico
    public Empleado() {
    }
    
    public Empleado(String nombre, int edad) {
        Nombre = nombre;
        this.edad = edad;
    }


    //metodos
    public String getNombre() { //getear and seder
        return Nombre;
    }
    
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString() {
        return "Empleado [Nombre=" + Nombre + ", edad=" + edad + "]";
    }

        
    
}
