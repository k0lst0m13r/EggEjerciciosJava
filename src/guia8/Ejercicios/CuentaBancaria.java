package guia8.Ejercicios;

public class CuentaBancaria {

    private int nroCuenta;
    private int dniCliente;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int nroCuenta, int dniCliente, double saldoActual) {
        this.nroCuenta = nroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Sus Datos\n" +
                "nro de Cuenta: " + nroCuenta + "\n" +
                "DNI del Cliente: " + dniCliente + "\n" +
                "Saldo actual: " + saldoActual;
    }
}
