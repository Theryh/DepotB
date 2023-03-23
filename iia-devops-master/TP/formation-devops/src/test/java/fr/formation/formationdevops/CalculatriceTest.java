package fr.formation.formationdevops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {
    private Calculatrice calc = new Calculatrice();
    
    @Test
    void should5And6Return11() {
        Assertions.assertEquals(11, this.calc.additionner(5, 6));
    }

    @Test
    void should10And5Return15() {
        Assertions.assertEquals(15, this.calc.additionner(10, 5));
    }

    @Test
    void should5Minus6ReturnMinus1() {
        Assertions.assertEquals(-1, this.calc.soustraire(5, 6));
    }

    @Test
    void should10Minus5Return5() {
        Assertions.assertEquals(5, this.calc.soustraire(10, 5));
    }

}
