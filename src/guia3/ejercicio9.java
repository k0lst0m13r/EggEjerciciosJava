package guia3;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        int cont = 1;
        int suma = 0;
        int num;
        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese numero");
            num = leer.nextInt();

            if (num > 0){
                suma += num;
            } else if (num == 0) {
                System.out.println("Se capturó el número cero");
                break;
            }
            cont ++;
        } while (cont <= 20);
        System.out.println("La suma de los números ingresados es " + suma);
    }
}
