package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InscripcionTest {

    Alumno juan = new Alumno("1234567", "Juan");
    Alumno german = new Alumno("1234567","German");
    Materia analisis_1 = new Materia("analisis 1");
    Materia algebra = new Materia("algebra");
    Materia analisis_2 = new Materia("analisis 2");


    @Test
    public void alumnoPuedeInscribirseAMateria(){
    // un alumno con am1 y algebra aprobadas puede anotarse a am2
        Inscripcion inscripcion = new Inscripcion();


        inscripcion.setAlumno(german);
        inscripcion.setMateriasAInscribir(analisis_2);

        german.setMateriasAprobadas(analisis_1,algebra);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void alumnoNoPuedeInscribirseAMateria() {
        // un alumno sin am1 y algebra aprobadas puede anotarse a am2
        Inscripcion inscripcion = new Inscripcion();
        analisis_2.setCorrelativas(analisis_1,algebra);

        inscripcion.setAlumno(juan);
        german.setMateriasAprobadas(analisis_1);
        inscripcion.setMateriasAInscribir(analisis_2);

        Assertions.assertFalse(inscripcion.aprobada());
    }
}



