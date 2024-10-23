package p119_Organismo;

public class Perro extends Organismo implements Canino {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void Correr() {
        System.out.println("Es un canino que corre > es un perro");

        
    }

    @Override
    public void cuatroPatas() {
        System.out.println("es un canino que camina en cuatro patas > es un perron");
        
    }

    @Override
    public void SangreCaliente() {
        System.out.println("es un animal multicelular > es un perron");
        
    }

    @Override
    public void multiCelular() {
        System.out.println("es un animal de sangre cakiente > es un perron");
        
    }
    
    
}
