package guia3.ejerciciosExtra;

import java.util.Scanner;

public class ejExtra3 {
    public static void main(String[] args) {
        Scanner ing = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = ing.next();

        if (letra.equalsIgnoreCase("a") ||
            letra.equalsIgnoreCase("e") ||
            letra.equalsIgnoreCase("i") ||
            letra.equalsIgnoreCase("o") ||
            letra.equalsIgnoreCase("u")
        ) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }
}
