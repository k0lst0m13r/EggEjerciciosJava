import guia10.servicios.ej1Servicios;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> lista = ej1Servicios.agregarRazas();
    ej1Servicios.eliminarRaza(lista);

  }
}