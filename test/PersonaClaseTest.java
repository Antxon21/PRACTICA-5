import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Creamos la nueva clase que se llama "PersonaClaseTest,
 * en el que sirve para realizar los tests de los datos que
 * esperamos.
 *
 * @author Antxon y Richard
 * @version v1.2.0
 */

class PersonaClaseTest {

    PersonaClase alumno = new PersonaClase("Antxon", 18, "412324T");

    /**
     * Creamos los tests para verificar si el valor
     * que añadimos es el correspondiente.
     */

    @Test
    public void getNombre(){
        assertEquals("Antxon",alumno.getNombre());
    }

    @Test
    public void getDni(){
        assertEquals("76123a",alumno.getDni());
    }

    @Test
    public void getEdad(){
        assertEquals(18,alumno.getEdad());
    }


}