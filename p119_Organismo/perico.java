package p119_Organismo;

public class perico extends Organismo implements Ave{

    public perico(String nombre) {
        super(nombre);
    }

    @Override
    public void Volar() {
        System.out.println("es un ave que vuela > es un perico");
        
    }

    @Override
    public void dosPatas() {
        System.out.println("es un ave quecamina en dos patas > es un perico");
        
    }

    @Override
    public void SangreCaliente() {
        System.out.println("es un ave de sangre caliente > es un perico");
        
    }

    @Override
    public void multiCelular() {
        System.out.println("es un animal multicecular > es un perico");
        
    }
    
}
