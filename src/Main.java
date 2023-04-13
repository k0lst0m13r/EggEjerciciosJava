import guia7.Entidad.Circunferencia;

public class Main {
    public static void main(String[] args) {
        Circunferencia circ1 = new Circunferencia(7);
        System.out.println(circ1.area());
        System.out.println(circ1.perimetro());

        circ1.crearCircunferencia();
        System.out.println(circ1.area());
        System.out.println(circ1.perimetro());

    }
}