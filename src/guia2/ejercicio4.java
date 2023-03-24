package guia2;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese grados a convertir: ");
        double celsius = leer.nextDouble();
        double farenheit = 32 + (9 * celsius / 5);
        System.out.println(celsius + " Grados celsius equivalen a " + farenheit + " grados farenheit");
    }
}
