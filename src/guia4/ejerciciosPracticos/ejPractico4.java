package guia4.ejerciciosPracticos;

import java.util.Scanner;

public class ejPractico4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un número para saber si es primo");
        int numero = num.nextInt();

        System.out.println(esPrimo(numero));
    }

    public static boolean esPrimo(int numero) {

        // está mal (revisar formula)
        if ((numero % 2 == 0 || numero % 3 == 0) && (numero != 2 && numero != 3)) {
            return false;
        } else {
            return true;
        }
    }
}
