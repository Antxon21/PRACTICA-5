//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    PersonaClase alumno = new PersonaClase("Antxon", 18, "412324T");

    int edad = 23;
    String nombre = "Richard";
    if (alumno.getEdad() > edad){
        System.out.println(alumno.getNombre() + " es mayor que " + nombre);
    } else if (alumno.getEdad() == edad){
        System.out.println(alumno.getNombre() + " y " + nombre + " tinen la misma edad");
    } else {
        System.out.println(alumno.getNombre() + " es menor que " + nombre);
    }

    }
}