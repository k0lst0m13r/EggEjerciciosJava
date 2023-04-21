import guia8.Ejercicios.CuentaBancaria;
import guia8.Servicios.ServicioCuenta;

public class Main {
  public static void main(String[] args) {


    ServicioCuenta nuevaCuenta = new ServicioCuenta();

    CuentaBancaria cuenta = nuevaCuenta.crearCuenta();

    ServicioCuenta.depositar(cuenta);
    ServicioCuenta.consultarSaldo(cuenta);

    ServicioCuenta.retirar(cuenta);
    ServicioCuenta.consultarSaldo(cuenta);

    ServicioCuenta.extraccionRapida(cuenta);
    ServicioCuenta.consultarSaldo(cuenta);

    ServicioCuenta.consultarDatos(cuenta);

  }
}