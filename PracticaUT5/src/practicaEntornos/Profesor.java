package practicaEntornos;

/**
 * Clase que representa a un profesor.
 * Esta clase almacena información sobre el nombre, la especialidad y la experiencia de un profesor.
 * @author Hugo Carnicero Navidad
 * @version 1.0
 * @since 1.0
 */
public class Profesor {

    private String nombre;
    private String especialidad;
    private int experiencia;

    /**
     * Constructor de la clase Profesor.
     * @param nombre El nombre del profesor.
     * @param especialidad La especialidad del profesor.
     * @param experiencia La experiencia del profesor en años.
     */
    public Profesor(String nombre, String especialidad, int experiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }

    /**
     * Método para obtener el nombre del profesor.
     * @return El nombre del profesor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener la especialidad del profesor.
     * @return La especialidad del profesor.
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Método para obtener la experiencia del profesor.
     * @return La experiencia del profesor en años.
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     * Método para verificar si el profesor tiene experiencia suficiente.
     * @param aniosExperiencia La cantidad de años de experiencia requerida.
     * @return true si la experiencia del profesor es mayor o igual a la requerida, false de lo contrario.
     */
    public boolean tieneExperienciaSuficiente(int aniosExperiencia) {
        return experiencia >= aniosExperiencia;
    }
}
