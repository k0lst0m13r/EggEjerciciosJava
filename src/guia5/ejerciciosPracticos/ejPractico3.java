package guia5.ejerciciosPracticos;

public class ejPractico3 {
    public static void main(String[] args) {
        int [] vector = {1000, 23, 567, 90875, 7};
        int unDigito = 0;
        int dosDigitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;

        for (int i = 0; i < vector.length; i++) {
            double divisor = 10;
            int cont = 1;
            while (vector[i] / divisor >= 1) {
                divisor *= 10;
                cont++;
            }
            switch (cont){
                case 1:
                    unDigito ++;
                    break;
                case 2:
                    dosDigitos ++;
                    break;
                case 3:
                    tresDigitos ++;
                    break;
                case 4:
                    cuatroDigitos ++;
                    break;
                case 5:
                    cincoDigitos ++;
                    break;
            }
        }

        System.out.println("Hay " +unDigito+ " de un digito ");
        System.out.println("Hay " +dosDigitos+ " de dos digitos ");
        System.out.println("Hay " +tresDigitos+ " de tres digitos ");
        System.out.println("Hay " +cuatroDigitos+ " de cuatro digitos ");
        System.out.println("Hay " +cincoDigitos+ " de cinco digitos ");
    }
}
