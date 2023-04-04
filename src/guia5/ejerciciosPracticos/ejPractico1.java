package guia5.ejerciciosPracticos;

public class ejPractico1 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }
        for (int i = numeros.length - 1; i >= 0;  i--) {
            System.out.println(numeros[i]);
        }
    }
}
