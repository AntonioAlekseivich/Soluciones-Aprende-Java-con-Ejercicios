package unidad_04_SentenciaCondicional_IfSwitch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests_sentenciaCondicional {

	@Test
	void esPrimo() {
		assertEquals(Ejercicio01_al_14_08.esPrimo(7),true);
		assertEquals(Ejercicio01_al_14_08.esPrimo(8),false);
	}

}
