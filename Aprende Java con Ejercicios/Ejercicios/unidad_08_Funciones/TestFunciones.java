package unidad_08_Funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFunciones {

	@Test
	void esCapicua() {
		assertEquals(Ejercicio01_al_14_08.esCapicua(1331),true);
	}
	
	@Test
	void esPrimo() {
		assertEquals(Ejercicio01_al_14_08.esPrimo(7),false);
	}

}
