package guia7.Entidad;

import java.util.Scanner;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo() {
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void crearRectangulo() {
        System.out.println("Ingrese la base");
        Scanner sc = new Scanner(System.in);
        base = sc.nextDouble();
        System.out.println("Ingrese la altura");
        Scanner sc2 = new Scanner(System.in);
        altura = sc2.nextDouble();
    }
    public double superficie() {
        return base * altura;
    }
    public double perimetro() {
        return (base + altura) * 2;
    }
    public void dibujarRectangulo() {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == 0 || i == base - 1 ||
                    j == 0 || j == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
