package guia10.servicios;

import guia10.ejercicios.Alumno;
import java.util.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServAlumno {
    public static ArrayList<Alumno> crearAlumno() {

        ArrayList<Alumno> alumnos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean crear = true;
        do {
            Alumno alumno = new Alumno();
            ArrayList<Integer> lista = new ArrayList<>();
            System.out.println("Ingrese nombre");
            alumno.setNombre(sc.nextLine());
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese nota");
                lista.add(sc.nextInt());
            }
            sc.nextLine();
            alumno.setNotas(lista);

            System.out.println("Crear otro alumno s/n");
            if ("n".equalsIgnoreCase(sc.nextLine())) {
                System.out.println("Gracias");
                crear = false;

            }
            alumnos.add(alumno);
        } while (crear);
        return alumnos;
    }

    public static void notaFinal(ArrayList<Alumno> lista){
       double notaFinal = 0;
       //ArrayList<Alumno> notas = new ArrayList<>();
        System.out.println("Ingrese nombre del alumno");
        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();
        for (Alumno alumno: lista) {
            if (alumno.getNombre().equals(nombre)) {
                ArrayList<Integer> notas = alumno.getNotas();
                int suma = 0;
                for (Integer nota: notas) {
                    suma += nota;
                    notaFinal = suma / 3;
                }
            }
        }
        System.out.println("La nota final del alumno " + nombre + " es: " + notaFinal);
    }
}
