/**
 * Creamos la clase PersonaClase, con sus atributos,
 * constructores y GETTERS y SETTERS
 *
 * @author Antxon y Richard
 * @version v1.2.0
 */

public class PersonaClase {

    private String nombre;
    private Integer edad;
    private String dni;



    /**
     * Creamos los getters, para saber lo que contiene ese campo
     */
    public String getNombre(){
        return nombre;
    }


    /**
     * Creamos los getters, para saber lo que contiene ese campo
     */
    public Integer getEdad(){
        return edad;
    }


    /**
     * Creamos los getters, para saber lo que contiene ese campo
     */
    public String getDni(){
        return dni;
    }

    /**
     * Creamos el método setNombre
     * @param nuevonombre Sirve para añadir el nuevo nombre que vamos a cambiar
     */
    public void setNombre(String nuevonombre){
        nombre = nuevonombre;
    }


    /**
     * Creamos el método setNombre
     * @param nuevoedad Sirve para añadir la edad que vamos a cambiar
     */
    public void setEdad(Integer nuevoedad){
        edad = nuevoedad;
    }


    /**
     * Creamos el método setNombre
     * @param nuevodni Sirve para añadir el dni que vamos a cambiar
     */
    public void setDni(String nuevodni){
        dni = nuevodni;
    }




    /**
     * Creamos el constructor vacío
     */
    public PersonaClase(){
    }

    /**
     * Creamos el constructor
     * @param nuevonombre Le pasamos el nombre al constructor
     * @param nuevoedad Le pasamos la edad al constructor
     * @param nuevodni Le pasamos el DNI al constructor
     */
    public PersonaClase(String nuevonombre, int nuevoedad, String nuevodni){
        this.nombre = nuevonombre;
        this.edad = nuevoedad;
        this.dni = nuevodni;
    }

}
