package guia3;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int num = leer.nextInt();

        Scanner leer1 = new Scanner(System.in);
        System.out.println("Ingrese otro numero ");
        int num1 = leer1.nextInt();

        if (num > 25 && num1 > 25) {
            System.out.println("Ambos numeros son mayores de 25");
        } else if (num > 25 || num1 > 25) {
            System.out.println("Uno de los numeros es mayor a 25");
        } else {
            System.out.println("Ninguno de los numeros es mayor a 25");
        }
    }
}
