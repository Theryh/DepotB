package fr.formation.formationdevops.cucumber;

import org.junit.jupiter.api.Assertions;

import fr.formation.formationdevops.FizzBuzz;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Quand;

public class FizzBuzzSteps {
    private String result;

    @Quand("l'utilisateur converti de {int} à {int}")
    public void whenConvert(int min, int max) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        this.result = fizzBuzz.process(min, max);
    }

    @Alors("il aura {string}")
    public void thenCompare(String result) {
        Assertions.assertEquals(this.result, result);
    }
}
