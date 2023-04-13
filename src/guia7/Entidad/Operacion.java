package guia7.Entidad;

import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        System.out.println("Ingrese primer número");
        Scanner sc = new Scanner(System.in);
        numero1 = sc.nextDouble();
        System.out.println("Ingrese segundo número");
        Scanner sc2 = new Scanner(System.in);
        numero2 = sc2.nextDouble();
    }

    public double sumar() {
        return numero1 + numero2;
    }

    public double restar() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error! multiplicación por 0");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }
    public double dividir() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error! multiplicación por 0");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
}