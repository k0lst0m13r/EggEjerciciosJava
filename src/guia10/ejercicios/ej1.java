package guia10.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        String aux = "";
        Scanner sc = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList<>();

        do {
            System.out.println("Ingrese una raza o presione x para salir");
            aux = sc.nextLine();
            if (aux.equalsIgnoreCase("x")){
                for (String raza: razas) {
                    System.out.println(raza);
                }

            } else {
                razas.add(aux);
            }
        } while (!aux.equalsIgnoreCase("x"));
    }

}
