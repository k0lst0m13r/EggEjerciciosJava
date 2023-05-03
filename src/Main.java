import guia9.Servicios.ParDeNumerosService;
import guia9.Ejercicios.ParDeNumeros;

import static guia9.Servicios.ParDeNumerosService.*;

public class Main {
  public static void main(String[] args) {
    ParDeNumeros nums = new ParDeNumeros();
    mostrarValores(nums);
    devolverMayor(nums);
    calcularPotencia(nums);
    calcularRaiz(nums);


  }
}