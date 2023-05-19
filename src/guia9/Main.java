package guia9;

import guia9.Servicios.ArregloService;

public class Main {

    public static void main(String[] args) {
        Double A[] = new Double[50];
        Double B[] = new Double[20];

        ArregloService.inicializarA(A);
        ArregloService.mostrar(A);
        ArregloService.ordenar(A);
        ArregloService.inicializarB(A, B);
        ArregloService.mostrar(A);
        ArregloService.mostrar(B);

    }

}
