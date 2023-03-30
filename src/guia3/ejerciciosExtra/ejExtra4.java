package guia3.ejerciciosExtra;

import java.util.Scanner;

public class ejExtra4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 10");
        int numero = num.nextInt();

        // Alternativa con condicionales IF
        System.out.print("Con if y for: ");
        if (numero < 4) {
            for (int i = 0; i < numero; i++) {
                System.out.print("I");
            }
        } else if (numero == 4){
            System.out.print("IV");
        } else if (numero == 5){
            System.out.print("V");
        } else if (numero > 5 && numero < 9) {
            System.out.print("V");
            for (int i = 0; i < numero - 5; i++) {
                System.out.print("I");
            }
        } else if (numero == 9) {
            System.out.print("IX");
        } else {
            System.out.print("X");
        }
        System.out.println("");

        //Alternativa con Switch
        System.out.print("Con Switch: ");
        switch (numero) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
        }
    }
}
