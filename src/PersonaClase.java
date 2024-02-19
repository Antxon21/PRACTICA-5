public class PersonaClase {

    private String nombre;
    private Integer edad;
    private String dni;

    public String getNombre(){
        return nombre;
    }

    public Integer getEdad(){
        return edad;
    }

    public String getDni(){
        return dni;
    }

    public void setNombre(String nuevonombre){
        nombre = nuevonombre;
    }

    public void setEdad(Integer nuevoedad){
        edad = nuevoedad;
    }

    public void setDni(String nuevodni){
        dni = nuevodni;
    }


    public PersonaClase(){
    }

    public PersonaClase(String nuevonombre, int nuevoedad, String nuevodni){
        this.nombre = nuevonombre;
        this.edad = nuevoedad;
        this.dni = nuevodni;
    }

}
