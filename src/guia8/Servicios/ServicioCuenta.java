package guia8.Servicios;

import guia8.Ejercicios.CuentaBancaria;

import java.util.Scanner;

public class ServicioCuenta {
    private Scanner sc = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {

        System.out.println("Ingrese numero de Cuenta");
        int nro = sc.nextInt();

        System.out.println("Ingrese numero de DNI");
        int dni = sc.nextInt();

        System.out.println("Ingrese su Saldo Actual");
        double saldo = sc.nextDouble();

        return new CuentaBancaria(nro, dni, saldo);

    }

    public static double depositar(CuentaBancaria cuenta) {
        System.out.println("Ingrese la cantidad a depositar");
        Scanner sc = new Scanner(System.in);
        double cantidad = sc.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
        System.out.println("Ingresó $ " + cantidad);
        return cuenta.getSaldoActual();
    }

    public static double retirar(CuentaBancaria cuenta) {
        System.out.println("Ingrese la cantidad a retirar");
        Scanner sc = new Scanner(System.in);
        double cantidad = sc.nextDouble();
        if (cantidad > cuenta.getSaldoActual()) {
            System.out.println("Saldo insuficiente. Retira: $" + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        } else {
            System.out.println("Retira: $" + cantidad);
            cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
        }
        return cuenta.getSaldoActual();
    }

    public static double extraccionRapida(CuentaBancaria cuenta) {
        System.out.println("¿Desea realizar una extracción rápida? s/n");
        Scanner sc = new Scanner(System.in);
        String op = sc.nextLine();
        if (op.equalsIgnoreCase("s")) {
            double retiro = cuenta.getSaldoActual() * 0.2;
            System.out.println("Retira: $" + retiro);
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        }
        return cuenta.getSaldoActual();
    }

    public static void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Su saldo es: $" + cuenta.getSaldoActual());
    }

    public static void consultarDatos(CuentaBancaria cuenta) {
        System.out.println(cuenta.toString());
    }
}
