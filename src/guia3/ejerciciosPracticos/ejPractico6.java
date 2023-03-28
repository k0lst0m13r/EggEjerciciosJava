package guia3.ejerciciosPracticos;

import java.util.Scanner;

public class ejPractico6 {
    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 = leer1.nextInt();
        Scanner leer2 = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num2 = leer2.nextInt();

        int opcion;
        boolean cerrar = false;

        do {
            Scanner op = new Scanner(System.in);
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opción");
            opcion = op.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división es: " + (num1 / num2));
                    break;
                case 5:
                    Scanner sn = new Scanner(System.in);
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String salir = sn.nextLine();
                    if (salir.equals("s") || salir.equals("S")) {
                        cerrar = true;
                    }
            }
        } while (!cerrar);
    }
}
