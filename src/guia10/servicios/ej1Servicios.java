package guia10.servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ej1Servicios {

    public static ArrayList<String> agregarRazas() {
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
        return razas;
    }

    public static void eliminarRaza(ArrayList<String> lista) {
        System.out.println("Ingrese la raza que desea eliminar");
        Scanner sc = new Scanner(System.in);
        boolean esta = false;
        String raza = sc.nextLine();
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next().equals(raza)) {
                it.remove();
                esta = true;
            }
        }
        if (!esta) {
            System.out.println("La raza no de encuentra en la lista ");
        }
        Collections.sort(lista);
        System.out.println(lista);
    }
}

