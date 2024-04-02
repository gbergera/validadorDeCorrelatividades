package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MateriaTest {


    Materia analisis_1 = new Materia("analisis 1");
    Materia algebra = new Materia("algebra");
    Materia analisis_2 = new Materia("analisis 2");

    @Test
    public void analisis2TieneCorrelatividades(){
        analisis_2.setCorrelativas(algebra,analisis_1);

        Assertions.assertEquals(2,analisis_2.getCorrelativas().size());
    }

    @Test
    public void analisis1NoTieneCorrelatividades(){
        Assertions.assertEquals(0,analisis_1.getCorrelativas().size());
    }
}
