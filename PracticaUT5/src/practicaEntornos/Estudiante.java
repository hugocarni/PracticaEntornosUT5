package practicaEntornos;

/**
 * Clase que representa a un estudiante.
 * Esta clase almacena información sobre el nombre, la edad y el promedio de un estudiante.
 * @author Hugo Carnicero Navidad
 * @version 1.0
 * @since 1.0
 */
public class Estudiante {

    private String nombre;
    private int edad;
    private double media;

    /**
     * Constructor de la clase Estudiante.
     * @param nombre El nombre del estudiante.
     * @param edad La edad del estudiante.
     * @param promedio El promedio del estudiante.
     */
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.media = promedio;
    }

    /**
     * Método para obtener el nombre del estudiante.
     * @return El nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener la edad del estudiante.
     * @return La edad del estudiante.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para obtener el promedio del estudiante.
     * @return El promedio del estudiante.
     */
    public double getMedia() {
        return media;
    }

    /**
     * Método para calcular si el estudiante está aprobado.
     * @return true si el promedio es mayor o igual a 5, false de lo contrario.
     */
    public boolean estaAprobado() {
        return media >= 5.0;
    }
}
