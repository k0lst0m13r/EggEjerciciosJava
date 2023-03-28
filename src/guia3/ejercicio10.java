package guia3;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Ingrese 4 números (comprendidos entre 1 y 20)");
        for (int i = 0; i < 4; i++) {
            Scanner leer = new Scanner(System.in);
            int num = leer.nextInt();
            System.out.print(num + " ");
            if (num >= 1 && num <= 20) {
                for (int j = 0; j < num ; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                    i--;
                System.out.println("Numero incorrecto");
            }
        }
    }
}
