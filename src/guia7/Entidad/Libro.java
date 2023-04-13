package guia7.Entidad;

import java.util.Scanner;

public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void cargarLibro() {

        System.out.println("Ingrese el ISBN");
        Scanner leer = new Scanner(System.in);
        isbn = leer.nextInt();
        System.out.println("Ingrese el Título");
        Scanner leer2 = new Scanner(System.in);
        titulo = leer2.nextLine();
        System.out.println("Ingrese el Autor");
        Scanner leer3 = new Scanner(System.in);
        autor = leer3.nextLine();
        System.out.println("Ingrese la cantidad de paginas");
        Scanner leer4 = new Scanner(System.in);
        paginas = leer4.nextInt();

    }
    public void mostrarLibro() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Cantidad de Páginas: " + paginas);
    }
}
