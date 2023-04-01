package guia4.ejerciciosPracticos;

import java.util.Scanner;

public class ejPractico2 {
    public static void main(String[] args) {
       persona();
    }

    public static void persona() {
            String continuar = "";
        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese su edad");
            int edad = leer.nextInt();
            Scanner leer2 = new Scanner(System.in);
            System.out.println("Ingrese su nombre");
            String nombre = leer2.nextLine();

            if (edad < 18) {
                System.out.println(nombre + " Sos menor de edad");
            } else {
                System.out.println(nombre + " Sos mayor de edad");
            }
            Scanner sigue = new Scanner(System.in);
            System.out.println("Quiere seguir mostrando personas? Si / No");
            continuar = sigue.nextLine();
        } while (!continuar.equalsIgnoreCase("no"));

    }
}

