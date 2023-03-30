package guia3.ejerciciosExtra;

import java.util.Scanner;

public class ejExtra5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su plan: A, B, o C");
        String plan = leer.next();

        Scanner leer2 = new Scanner(System.in);
        System.out.println("Ingrese el costo de su tratamiento");
        double costoTratamiento = leer2.nextDouble();
        double costoFinal;

        if (plan.equalsIgnoreCase("a")) {
            costoFinal = costoTratamiento -= costoTratamiento / 2;
            System.out.println("El costo con el descuento es de $" + costoFinal);
        } else if (plan.equalsIgnoreCase("b")) {
            costoFinal = costoTratamiento -= costoTratamiento * 0.35;
            System.out.println("El costo con el descuento es de $" + costoFinal);
        } else {
            System.out.println("Su plan no tiene descuento, el costo es de $" + costoTratamiento);
        }
    }
}