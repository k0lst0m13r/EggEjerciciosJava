package guia7.Entidad;

import java.util.Scanner;

public class Circunferencia {
    private double radio;
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void crearCircunferencia() {
        System.out.println("Ingrese un radio");
        Scanner sc = new Scanner(System.in);
        setRadio(sc.nextDouble());
    }
    public double area(){
        double area = Math.PI * Math.pow(radio,2);
        return area;
    }

    public double perimetro(){
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
}
