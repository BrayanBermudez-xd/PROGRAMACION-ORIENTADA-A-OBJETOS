package p111_CuentaBancariaV2;

import java.util.ArrayList;

import p110_CuentaBancariaV1.CuentaBancaria;

public class Banco {
    private String nombre;
    private String domicilio;
    private ArrayList<Cliente> clientes;

    public Banco () {
        clientes = new ArrayList<>();
    }

    public Banco(String nombre, String domicilio) {
        this();
        this.nombre = nombre;
        this.domicilio = domicilio;
    }
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
   
    public double getTotal() {
        double total = 0;
        for (Cliente cliente : clientes) {
            total += cliente.getTotal();
        }
        return total;
    }
    
    public void calcularInteres() {
        for (Cliente cliente : clientes) {
            for (CuentaBancaria cuenta : cliente.getCuentas()) {
                if (cuenta instanceof CuentaDeAhorro) {
                    ((CuentaDeAhorro)cuenta).calcularInteres();
                    
                }
            }
        }
    }
    

    
    public String toString() {
        return "Banco [nombre=" + nombre + ", domicilio=" + domicilio + ", clientes=" + clientes.size() + "]";

    }
    
}
