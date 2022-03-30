import java.util.Random;

class CuentaBancaria {

    private double saldoCuentaCorriente;
    private double saldoCuentaAhorros;
    private long numeroDeCuenta;

    private static int cuentasCreadas = 0;
    private static double cantidadTotalDinero = 0;

    public CuentaBancaria() {
        this.saldoCuentaAhorros = 0;
        this.saldoCuentaCorriente = 0;
        this.numeroDeCuenta = generarNumeroDeCuentaAleatorio();

        cuentasCreadas++;
    }
    

    public double getSaldoCuentaAhorros() {
        return saldoCuentaAhorros;
    }

    public double getSaldoCuentaCorriente() {
        return saldoCuentaCorriente;
    }

    public static int getCuentasCreadas() {
        return cuentasCreadas;
    }

    public static double getcantidadTotalDinero(){
        return cantidadTotalDinero;
    }

    public void depositarDinero(String tipoDeCuenta, double cantidadDinero){
        if(tipoDeCuenta == "Cuenta Corriente"){
            saldoCuentaCorriente += cantidadDinero;
        } else{
            saldoCuentaAhorros += cantidadDinero;
        }
        cantidadTotalDinero += cantidadDinero;
    }

    public void retirarDinero(String tipoDeCuenta, double cantidadDinero){
        if(tipoDeCuenta == "Cuenta Corriente" && cantidadDinero < saldoCuentaCorriente){
            saldoCuentaCorriente -= cantidadDinero;
            cantidadTotalDinero -= cantidadDinero;
        }else if(tipoDeCuenta == "Cuenta Ahorros" && cantidadDinero < saldoCuentaAhorros){
            saldoCuentaAhorros -= cantidadDinero;
            cantidadTotalDinero -= cantidadDinero;
        } else{
            System.out.println("Saldo insuficiente para realizar esta transaccion");
        }
    }

    public void mostrarCantidadTotalDinero(){
        System.out.println("Saldo cuenta corriente: "+saldoCuentaCorriente);
        System.out.println("Saldo cuenta ahorro: "+saldoCuentaAhorros);
    }

    public static long  generarNumeroDeCuentaAleatorio(){
        long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L; //Internet xD
        return number;
    }
}