public class TestCuentaBancaria {
    public static void main(String[] args){

        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria();
        System.out.println(CuentaBancaria.getCuentasCreadas());
        
        System.out.println(cuenta1.getSaldoCuentaAhorros());
        System.out.println(cuenta1.getSaldoCuentaCorriente());

        cuenta1.depositarDinero("Cuenta Corriente", 1000);
        cuenta1.depositarDinero("Cuenta Ahorros", 1500);
        System.out.println(cuenta1.getSaldoCuentaCorriente());
        
        cuenta1.retirarDinero("Cuenta Ahorros", 1500);
        cuenta1.retirarDinero("Cuenta Corriente", 500);
        System.out.println(cuenta1.getSaldoCuentaCorriente());

        cuenta1.mostrarCantidadTotalDinero();

        System.out.println(cuenta1.generarNumeroDeCuentaAleatorio());
    }
}