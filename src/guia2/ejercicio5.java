package guia2;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        double numero = leer.nextDouble();
        System.out.println("El doble del numero es: " + numero * 2);
        System.out.println("El triple del numero es: " + numero * 3);
        System.out.println("La raiz cualdrada del numero es: " + Math.sqrt(numero));
    }
}
