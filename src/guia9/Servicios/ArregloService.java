package guia9.Servicios;

import java.util.Arrays;
import java.util.Comparator;

public class ArregloService {

    public static void inicializarA (Double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random()*10;
        }
    }

    public static void mostrar(Double arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println("");
    }

    public static Double[] ordenar(Double arr[]) {

        Arrays.sort(arr, Comparator.reverseOrder());
        return arr;
    }

    public static void inicializarB(Double arrA[], Double arrB[]) {
        for (int i = 0; i <= 10; i++) {
            arrB[i] = arrA[i];

        }  Arrays.fill(arrB, 10, 19,0.5);
    }
}
