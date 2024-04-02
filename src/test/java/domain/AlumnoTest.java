package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlumnoTest {
    Alumno guido = new Alumno("1234567","Guido");
    Alumno mateo = new Alumno("8912345","Mateo");
    Materia discreta = new Materia("Discreta");
    Materia fisica_1 = new Materia("Fisica 1");
    Materia arq_computadores = new Materia("Arquitectura de Computadores");

    @Test
    public void guidoTieneAprobadasTodasLasMaterias(){
        guido.setMateriasAprobadas(fisica_1,discreta,arq_computadores);
        Assertions.assertEquals(3,guido.getMateriasAprobadas().size());
    }

    @Test
    public void mateoNoAproboDiscreta(){
        mateo.setMateriasAprobadas(fisica_1,arq_computadores);
        Assertions.assertFalse(mateo.getMateriasAprobadas().contains(discreta));
    }


}
