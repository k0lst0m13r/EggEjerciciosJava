package guia5.ejerciciosPracticos;

import java.util.Scanner;

import static java.lang.Math.random;
import static java.lang.Math.toIntExact;

public class ejPractico2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese longitud del vector");
        int longitud = n.nextInt();
        int[] vector = new int[longitud];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea buscar");
        int buscar = ent.nextInt();
        int cont = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar) {
                System.out.println("El número " +buscar+ " se encuentra en el index["+i+"]");
                cont++;
            }
            }
            if (cont > 1) {
                System.out.println("El número "+buscar+" se encuentra repetido "+cont+" veces");
            } else if (cont == 0) {
                System.out.println("El número buscado no se encuentra en el vector");
        }
    }
}


