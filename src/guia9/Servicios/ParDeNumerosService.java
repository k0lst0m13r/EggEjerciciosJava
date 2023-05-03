package guia9.Servicios;

import guia9.Ejercicios.ParDeNumeros;

public class ParDeNumerosService {
    ParDeNumeros numeros = new ParDeNumeros();

    public static void mostrarValores(ParDeNumeros numeros) {

        System.out.println("Los numeros guardados son: " + numeros.getNum1() + " y " + numeros.getNum2());
    }

    public static void devolverMayor(ParDeNumeros numeros) {
        if (numeros.getNum1() > numeros.getNum2()) {
            System.out.println("El atributo num1 contiene el mayor valor = " + numeros.getNum1());
        } else if (numeros.getNum1() == numeros.getNum2()) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("El atributo num2 contiene el mayor valor = " + numeros.getNum2());
        }
    }


    public static void calcularPotencia(ParDeNumeros numeros) {
        double mayor = Math.max(numeros.getNum1(), numeros.getNum2());
        double menor = Math.min(numeros.getNum1(), numeros.getNum2());
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        double potencia = Math.pow(mayor, menor);
        System.out.println("La potencia es " + potencia);
    }

    public static void calcularRaiz(ParDeNumeros numeros) {
        double menor = Math.min(numeros.getNum1(), numeros.getNum2());
        menor = Math.abs(menor);
        double raiz = Math.sqrt(menor);
        System.out.println("La potencia es " + raiz);
    }
}
