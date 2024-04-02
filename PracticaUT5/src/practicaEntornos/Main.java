package practicaEntornos;
/**
 * Clase que prueba los metodos de las clases.
 * @author Hugo Carnicero Navidad
 * @version 1.0
 * @see Estudiante
 * @see Profesor
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Juan", "Matematicas", 5);
        Estudiante alumno = new Estudiante("María", 20, 6.5);
        int exp = 6;
        // Mostrar datos del profesor
        System.out.println("Datos del profesor:");
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Especialidad: " + profesor.getEspecialidad());
        System.out.println("Experiencia: " + profesor.getExperiencia());
        System.out.println("Tiene la experiencia necesaria: " + profesor.tieneExperienciaSuficiente(exp));

        // Mostrar datos del alumno
        System.out.println("\nDatos del alumno:");
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Edad: " + alumno.getEdad());
        System.out.println("Media: " + alumno.getMedia());
        System.out.println("Aprueba: " + alumno.estaAprobado());
    }
}
