package integrador;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicios {
    static Estudiante estudiantes[] = new Estudiante[8];

    public static void crearEstudiantes () {

        for (int i = 0; i < estudiantes.length; i++) {
            Estudiante estudiante = new Estudiante();
            System.out.println("Ingrese nombre del estudiante");
            Scanner name = new Scanner(System.in);
            estudiante.setNombre(name.nextLine());
            System.out.println("Ingrese nota del estudiante");
            Scanner note = new Scanner(System.in);
            estudiante.setNota(note.nextInt());
            estudiantes[i] = estudiante;
        }
    }

    public static double promedioNotas() {
        int suma = 0;
        double promedio;

        for (int i = 0; i < estudiantes.length; i++) {
            suma += estudiantes[i].getNota();
        }
        promedio = suma / estudiantes.length;
        System.out.println("El promedio de las notas es: " + promedio);
        return promedio;
    }

    public static ArrayList<String> superanPromedio() {
        ArrayList<String> supPromedio = new ArrayList<String>();
        double promedio = promedioNotas();
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > promedio) {
              supPromedio.add(estudiantes[i].getNombre());
            }
        }
        return supPromedio;
    }

    public static void mostrarSupPromedio () {
        for (int i = 0; i < estudiantes.length; i++) {
            if (superanPromedio().contains(estudiantes[i].getNombre()));

        }
        System.out.println(estudiantes.toString());
    }

}
