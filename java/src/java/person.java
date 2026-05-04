package java;

public class person {
	   // 1. Atributos (Variables)
    private String nombre;
    private int edad;

    // 2. Constructor (Para crear el objeto)
    public person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // 3. Métodos Getter y Setter (Para leer y modificar datos)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}


