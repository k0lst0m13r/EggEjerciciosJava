package guia2;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int primerNumero;
        System.out.println("Ingresa el primer numero");
        primerNumero = leer.nextInt();

        Scanner leer2 = new Scanner(System.in);
        int segundoNumero;
        System.out.println("Ingresa el segundo numero");
        segundoNumero = leer2.nextInt();

        int resultado = primerNumero + segundoNumero;

        System.out.println("El resultado de sumar los numeros es " + resultado);
    }
}
