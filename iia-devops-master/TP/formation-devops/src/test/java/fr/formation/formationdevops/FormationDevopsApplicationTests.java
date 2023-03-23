package fr.formation.formationdevops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FormationDevopsApplicationTests {
	@Test
	void contextLoads() {

		Calculatrice calc = new Calculatrice();

		Assertions.assertEquals(11, calc.additionner(5, 6));
		Assertions.assertEquals(10, calc.additionner(4, 6));
		Assertions.assertEquals(0, calc.additionner(-4, 4));


		// Assertions.assertEquals(1, calc.soustraire(5, 6));

		// Dans un test, on fait des assertions
		// Assertions.assertTrue(true);

		// Assertions.assertEquals(10, 5 + 5);
	}
}
