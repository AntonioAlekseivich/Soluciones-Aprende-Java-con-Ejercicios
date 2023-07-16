package unidad_04_SentenciaCondicional_IfSwitch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio17_4Test {

	@Test
	void decimas () {
		assertEquals(Ejercicio17_4.ultimaCifra(23), 3);
	}
	@Test
	void centesimas () {
		assertEquals(Ejercicio17_4.ultimaCifra(234), 4);
	}
	@Test
	void unidades () {
		assertEquals(Ejercicio17_4.ultimaCifra(2), 2);
	}
}
