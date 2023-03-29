package guia3.ejerciciosExtra;

import java.util.Scanner;

public class ejExtra2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Ingrese valor de A");
        int A = a.nextInt();

        Scanner b = new Scanner(System.in);
        System.out.println("Ingrese valor de B");
        int B = b.nextInt();

        Scanner c = new Scanner(System.in);
        System.out.println("Ingrese valor de C");
        int C = c.nextInt();

        Scanner d = new Scanner(System.in);
        System.out.println("Ingrese valor de D");
        int D = d.nextInt();
        int aux;

        System.out.println("Antes A:"+ A +" B:"+ B +" C:"+ C + " D:" + D);

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("Despues A:"+ A +" B:"+ B +" C:"+ C + " D:" + D);
    }
}
