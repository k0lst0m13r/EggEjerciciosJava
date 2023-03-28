package guia3.ejerciciosPracticos;

import java.util.Scanner;

public class ejPractico5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese limite positivo");
        int limite = leer.nextInt();
        int suma = 0;
        System.out.println("Ingrese números hasta alcanzar límite");
        while (suma <= limite) {
            Scanner num = new Scanner(System.in);
            int numero = num.nextInt();
            suma += numero;
        }
        System.out.println("El límite ha sido superado");
    }
}
