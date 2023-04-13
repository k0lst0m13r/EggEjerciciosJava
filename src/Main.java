import guia7.Entidad.Operacion;

public class Main {
    public static void main(String[] args) {
        Operacion calculeta = new Operacion();
        calculeta.crearOperacion();
        System.out.println("Suma = " + calculeta.sumar());
        System.out.println("Resta = " + calculeta.restar());
        System.out.println("División = " + calculeta.dividir());
        System.out.println("Multiplicación = " + calculeta.multiplicar());


    }
}