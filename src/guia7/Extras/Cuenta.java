package guia7.Extras;

import java.util.Scanner;

public class Cuenta {
    private double saldo;
    private String titular;

    private String op;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirar_dinero() {
        System.out.println("Bienvenido " + titular);

        do {
            System.out.println("Ingrese el monto que desea retirar");
            Scanner sc = new Scanner(System.in);
            int retiro = sc.nextInt();
            if (saldo < retiro) {
                System.out.println("Saldo insuficiente");
            } else {
                System.out.println("Operacion realizada su saldo es: " + (saldo -= retiro));
            }
            System.out.println("¿Desea realizar otra operación?  s/n");
            Scanner leer = new Scanner(System.in);
            op = leer.next();

        } while (op.equalsIgnoreCase("S"));
        System.out.println("Gracias por operar con nosotros");
    }
}
