package domain;

import java.util.ArrayList;


import java.util.Collections;
import java.util.List;

public class Alumno {
    private String legajo;
    private String nombre;
    private List<Materia> materiasAprobadas;

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(Materia ... materia) {
        Collections.addAll(this.materiasAprobadas,materia);
    }

    public Alumno(String legajo, String nombre){
        this.legajo=legajo;
        this.nombre=nombre;
        this.materiasAprobadas = new ArrayList<>();
    }
    public Boolean aproboMateriasCorrelativas(Materia materia){
        List<Materia> correlativas = materia.getCorrelativas();
        return this.materiasAprobadas.containsAll(correlativas);
    }
}
