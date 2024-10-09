package p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        CuentaBancaria c1 = new CuentaBancaria(5000);
        System.out.println("saldo inicial " + c1.getSaldo());
        c1.deposita(10000);
        System.out.println("Saldo despues del primer deposito " + c1.getSaldo());
        double cr = 400;
        Boolean rsn = c1.retira(cr);
        if (rsn) System.out.println("Retiraste " + cr + " te quedan "  + c1.getSaldo());
        else System.out.println("No tienes ni para los cigarros, ponte a chambear che huevon");

        System.out.println("Probando cliente");
        Cliente cliente1 = new Cliente("Juan Perez ", c1);
        System.out.println("Cliente 1 " + cliente1);
        Cliente cliente2 = new Cliente("Carlos Castañeda " , new CuentaBancaria(1000));
        System.out.println(cliente2);
        cliente2.getCuenta().retira(900);
        System.out.println(cliente2);
        cliente1.getCuenta().retira(9000);
        System.out.println(cliente1);
        cliente2.getCuenta().deposita(10000);
        System.out.println(cliente2);
        Cliente mujer = new Cliente("Rocio", cliente2.getCuenta());
        mujer.getCuenta().retira(10100);
        System.out.println(cliente2);

        System.out.println("Probando la clase banco ooooooooomg");
        Banco miBanco = new Banco("Banco del bienestar", "Campus siglo XXI", null);
        miBanco.agregarCliente(cliente1);
        miBanco.agregarCliente(cliente2);
        miBanco.agregarCliente(mujer);
        miBanco.agregarCliente(new Cliente("Claudia la persi" , new CuentaBancaria(100000000)));  
        miBanco.gClientes().get(3).getCuenta().retira(90000); 
        miBanco.gClientes().get(0).getCuenta().deposita(30000);
        miBanco.gClientes().get(1).getCuenta().deposita(30000);   
        miBanco.gClientes().get(2).getCuenta().deposita(30000); 
        System.out.println("Los clientes del banco ");
        double total = 0;
        for (Cliente cte : miBanco.gClientes()) {
            System.out.println(cte);
            total = total + cte.getCuenta().getSaldo();
            
        }  
        System.out.printf("total del dinero en el banco %.2f " , total);
        

    }
}
