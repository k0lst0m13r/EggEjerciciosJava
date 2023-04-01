package guia4.ejerciciosPracticos;

import java.util.Scanner;

public class EjPractico3 {
    public static void main(String[] args) {
        Scanner cant =new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros");
        int euros = cant.nextInt();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la moneda a convertir: Y = yenes, D = dolares, L = libras");
        String moneda = leer.nextLine();

        euroConverter(euros, moneda);
    }

    public static void euroConverter(int euros, String moneda) {
        double cambio = 0;
        if (moneda.equalsIgnoreCase("Y")) {
            cambio = euros * 129.852;
            moneda = "Yenes";
        } else if (moneda.equalsIgnoreCase("D")) {
            cambio = euros * 1.28611;
            moneda = "Dolares";
        } else if (moneda.equalsIgnoreCase("L")) {
            cambio = euros * 0.86;
            moneda = "Libras";
        } else {
            System.out.println("No ingreso una moneda válida");
        }
        System.out.println("Su cambio por " +euros+ " Euros son " +cambio+ " " +moneda);
    }
}

