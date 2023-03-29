package guia3.ejerciciosExtra;

import java.util.Scanner;

public class ejExtra1 {
    public static void main(String[] args) {
        Scanner min = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos");
        int minutos = min.nextInt();

        int horas;
        int dias;

        dias = minutos / 1440;
        horas = minutos % 1440 / 60;
        System.out.println(dias + " dias " + horas + " horas"  );
    }
}
