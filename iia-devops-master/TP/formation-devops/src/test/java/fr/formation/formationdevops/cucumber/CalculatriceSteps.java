package fr.formation.formationdevops.cucumber;

import org.junit.jupiter.api.Assertions;

import fr.formation.formationdevops.Calculatrice;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Quand;

public class CalculatriceSteps {
    private Calculatrice calc = new Calculatrice();
    private int result = 0;

    @Quand("l'utilisateur fait {int}+{int}")
    public void whenAddition(int a, int b) {
        this.result = this.calc.additionner(a, b);
    }

    @Quand("l'utilisateur fait {int}-{int}")
    public void whenSoustraction(int a, int b) {
        this.result = this.calc.soustraire(a, b);
    }

    @Alors("le résultat est {int}")
    public void thenResult(int result) {
        Assertions.assertEquals(result, this.result);
    }
}
