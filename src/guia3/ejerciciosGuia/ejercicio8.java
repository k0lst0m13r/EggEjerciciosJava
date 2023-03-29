package guia3.ejerciciosGuia;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        int nota = -1;

        while(nota < 0 || nota > 10) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese una nota entre 0 y 10");
            nota = leer.nextInt();
        }
        System.out.println("La nota ingresada es " + nota);
    }

}
