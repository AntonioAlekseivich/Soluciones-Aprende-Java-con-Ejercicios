package unidad_04_SentenciaCondicional_IfSwitch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio13_4_Test {

	@Test
	void case1 () {
		assertEquals(Ejercicio13_4_Method.ordenamientoNumeral(3,2,1), "123");
	}
	@Test
	void case2 () {
		assertEquals(Ejercicio13_4_Method.ordenamientoNumeral(3,1,2), "123");
	}
	@Test
	void case3 () {
		assertEquals(Ejercicio13_4_Method.ordenamientoNumeral(2,3,1), "123");
	}
	@Test
	void case4 () {
		assertEquals(Ejercicio13_4_Method.ordenamientoNumeral(1,3,2), "123");
	}
	@Test
	void case5  () {
		assertEquals(Ejercicio13_4_Method.ordenamientoNumeral(2,1,3), "123");
	}
	@Test
	void case6 () {
		assertEquals(Ejercicio13_4_Method.ordenamientoNumeral(1,2,3), "123");
	}
	
}
