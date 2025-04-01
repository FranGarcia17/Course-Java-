package POO;

class Persona {
    String nombre;
    int edad;

    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodo para mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

public class POO {
    public static void main(String[] args){
        Persona persona1 = new Persona("Carlos", 25);
        Persona persona2 = new Persona("Ana", 20);

        persona1.mostrarInformacion();
        persona2.mostrarInformacion();
    }
}
