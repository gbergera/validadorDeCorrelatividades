package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAInscribir;

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setMateriasAInscribir(Materia ... materias) {
        Collections.addAll(this.materiasAInscribir,materias);
    }

    public Inscripcion(){
        this.materiasAInscribir = new ArrayList<>();
  }
    public Boolean aprobada() {
        return materiasAInscribir
                .stream()
                .allMatch(materia->alumno.aproboMateriasCorrelativas(materia));
    }
}
