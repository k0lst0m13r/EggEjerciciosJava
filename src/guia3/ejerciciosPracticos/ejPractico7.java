package guia3.ejerciciosPracticos;

import java.util.Scanner;

public class ejPractico7 {
    public static void main(String[] args) {

        int correctas = 0;
        int incorrectas = 0;
        System.out.println("Ingrese secuencia");
        String secuencia = "";
        do  {
            Scanner leer = new Scanner(System.in);

            secuencia = leer.nextLine();
            if (secuencia.length() == 5 & secuencia.substring(0,1).equals("X") & secuencia.substring(4).equals("O")) {
                correctas++;
            } else {
                incorrectas++;
            }
        } while (!secuencia.equals("&&&&&"));
        System.out.println(correctas + " lecturas correctas");
        System.out.println(incorrectas -1 + " lecturas incorrectas");
    }
}
