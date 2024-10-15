package p111_CuentaBancariaV2;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<CuentaBancaria> cuentas;

    public Cliente () {
        cuentas = new ArrayList<>();

    }

    public Cliente(String nombre, ArrayList<CuentaBancaria> cuentas) {
        this();
        this.nombre = nombre;

        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<CuentaBancaria> getCuentas() {
        return cuentas;
    }
    public double getTotal() {
        double total = 0;
        for (CuentaBancaria cuentaBancaria : cuentas) {
            total += cuenta.getSaldo();
        }
        return total;
    }

    public void setCuentas(ArrayList<CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", cuentas=" + cuentas.size() + "]";
    }
    
    


    
}
