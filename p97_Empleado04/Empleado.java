package p97_Empleado04;

public class Empleado {
    private String Nombre;
    private int edad; 
    private char sexo;
    private boolean casado;
    public Empleado() {
    }
    public Empleado(String nombre, int edad, char sexo, boolean casado) {
        Nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.casado = casado;
    }
    public String getNombre() {
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
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public boolean isCasado() {
        return casado;
    }
    public void setCasado(boolean casado) {
        this.casado = casado;
    }
    @Override
    public String toString() {
        return "p97_Empleado04 [Nombre=" + Nombre + ", edad=" + edad + ", sexo=" + sexo + ", casado=" + casado + "]";
    }

    
}
