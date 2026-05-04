package java;

//'extends Persona' establece la relación de herencia
public class Estudiante extends person {

 // Atributo específico de la subclase
 private String carrera;

 // Constructor
 public Estudiante(String nombre, int edad, String carrera) {
     // 'super' llama al constructor de la clase Persona
     super(nombre, edad); 
     this.carrera = carrera;
 }

 // Getter y Setter para el nuevo atributo
 public String getCarrera() {
     return carrera;
 }

 public void setCarrera(String carrera) {
     this.carrera = carrera;
 }

 // Ejemplo de un método propio del estudiante
 public void estudiar() {
     System.out.println(getNombre() + " está estudiando para su carrera de " + carrera);
 }
}

