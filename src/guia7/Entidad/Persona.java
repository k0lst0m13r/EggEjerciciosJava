package guia7.Entidad;

public class Persona {
    String nombre;
    int edad;
    String ocupacion;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Persona(String nombre, int edad, String ocupacion){
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

}
