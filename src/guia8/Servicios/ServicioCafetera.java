package guia8.Servicios;

import guia8.Ejercicios.Cafetera;

import java.util.Scanner;

public class ServicioCafetera {


    private Scanner sc = new Scanner(System.in);

    public Cafetera crearCafetera() {
        Cafetera cafetera = new Cafetera();
        System.out.println("Ingrese la Capacidad de la cafetera");
        cafetera.setCapacidadMaxima(sc.nextInt());
        cafetera.setCantidadActual(0);
        return cafetera;
    }

    public static void llenarCafetera(Cafetera cafetera) {
       cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    public static void servirTaza(Cafetera cafetera, int capacidadTaza) {

        if (cafetera.getCantidadActual() >= capacidadTaza) {
        cafetera.setCantidadActual(cafetera.getCantidadActual() - capacidadTaza);
            System.out.println("Su taza está llena");
    } else {
            System.out.println("Se sinvieron " + cafetera.getCantidadActual() + " cm3");
        }
    }

    public static void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }

    public static void agregarCafe(Cafetera cafetera, int cantidad) {
        cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidad);
        if (cafetera.getCantidadActual() > cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("La cafetera se desbordó");
        }
    }

}
