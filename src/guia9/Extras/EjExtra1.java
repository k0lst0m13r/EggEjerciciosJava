package guia9.Extras;

import java.sql.Array;
import java.util.Scanner;

public class EjExtra1 {

    public static void adivinaElMes() {

        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo",
                "junio", "julio", "agosto", "septiembre", "octubre",
                "noviembre", "diciempre"};

        String mesSecreto = meses[9];

        boolean intento = true;

        System.out.println("Adivine el mes secreto");

        Scanner sc = new Scanner(System.in);

        do {

            if (!sc.nextLine().equals(mesSecreto)) {
                System.out.println("No has acertado. Intenta nuevamente");
            } else {
                System.out.println("Acertaste!!");
                intento = false;
            }

        } while (intento);

    }
}
