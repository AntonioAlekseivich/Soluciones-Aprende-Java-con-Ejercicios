package unidad_04_SentenciaCondicional_IfSwitch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio18_4Test {

	@Test
	void cincoCifras () {
		assertEquals(Ejercicio18_4.primeraCifra(43569), 4);
	}
	@Test
	void cuatroCifras () {
		assertEquals(Ejercicio18_4.primeraCifra(4356), 4);
	}
	@Test
	void tresCifras () {
		assertEquals(Ejercicio18_4.primeraCifra(435), 4);
	}
	@Test
	void dosCifras () {
		assertEquals(Ejercicio18_4.primeraCifra(43), 4);
	}
	@Test
	void unaCifra () {
		assertEquals(Ejercicio18_4.primeraCifra(4), 4);
	}
}
