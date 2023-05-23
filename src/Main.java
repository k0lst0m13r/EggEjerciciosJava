

import guia10.ejercicios.Alumno;

import java.util.ArrayList;

import static guia10.servicios.ServAlumno.crearAlumno;
import static guia10.servicios.ServAlumno.notaFinal;

public class Main {
  public static void main(String[] args) {
   ArrayList<Alumno> lista = new ArrayList<>();
   lista = crearAlumno();
   notaFinal(lista);


  }
}