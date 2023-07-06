package unidad_04_SentenciaCondicional_IfSwitch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio14_4Test {

	@Test
	void esTruePar () {
		assertEquals(Ejercicio14_4.esParEsDivisibleEntre5(4), true);
	}
	@Test
	void esTrueDivisibleEntre5 () {
		assertEquals(Ejercicio14_4.esParEsDivisibleEntre5(15), true);
	}
	@Test
	void esFalse () {
		assertEquals(Ejercicio14_4.esParEsDivisibleEntre5(21), false);
	}

}
