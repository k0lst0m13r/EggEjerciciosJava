package guia2;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();

        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
}
