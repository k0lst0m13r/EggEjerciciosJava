package guia4.ejerciciosPracticos;

import java.util.Scanner;

public class ejPractico1 {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num1 = n1.nextInt();

        Scanner op = new Scanner(System.in);
        System.out.println("Ingrese operación: +, -, *, /");
        String operacion = op.nextLine();

        Scanner n2 = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num2 = n2.nextInt();
        double resultado = 0;

        switch (operacion){
            case "+":
                resultado = sumar(num1, num2);
                break;
            case "-":
                resultado = restar(num1, num2);
                break;
            case "*":
                resultado = multiplicar(num1, num2);
                break;
            case "/":
                resultado = dividir(num1, num2);
                break;
        }
        System.out.println("El resultado es: " + resultado);
    }

    public static double sumar(double a, double b) {
        return a + b;
    }
    public static double restar(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        return a / b;
    }
}
