package p120_Vehiculo;

public class suv extends Maquina implements TodoTerreno {
    public suv(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void ChasisIndependiente() {
        System.out.println("Es un autómovil con chaisis independiente es una Suv");
        
    }

    @Override
    public void Traccion4x4() {
        System.out.println("Es un autómovil con tracción 4 x 4 es una Suv");
        
    }

    @Override
    public void CombustionInterna() {
        System.out.println("Es un automóvil de combustion interna es una Suv");
        
    }

    @Override
    public void SistemaElectrico() {
        System.out.println("Es un autómovil con sistema eléctrico es una Suv");
    }

    
}
