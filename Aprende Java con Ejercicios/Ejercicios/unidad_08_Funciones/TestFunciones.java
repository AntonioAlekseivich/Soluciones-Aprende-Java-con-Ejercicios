package unidad_08_Funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFunciones {

	@Test
	void getArray() {//codigo escrito por chatGPT
	    int[] actual = Ejercicio01_al_14_08.getArray(1436);
	    int[] expected = {1, 4, 3, 6};
	    assertArrayEquals(expected, actual);}
	
	@Test
	void esCapicua() {
		assertEquals(Ejercicio01_al_14_08.esCapicua(53335),true);
		assertEquals(Ejercicio01_al_14_08.esCapicua(5333),false);
	}
	
	@Test
	void esPrimo() {
		assertEquals(Ejercicio01_al_14_08.esPrimo(7),true);
		assertEquals(Ejercicio01_al_14_08.esPrimo(8),false);
	}
	
	@Test
	void siguientePrimo() {
		assertEquals(Ejercicio01_al_14_08.siguientePrimo(11),13);
	}
	
	@Test
	void potencia() {
		assertEquals(Ejercicio01_al_14_08.potencia(8,6), 262144);
	}

	@Test
	void digitos() {
		assertEquals(Ejercicio01_al_14_08.digitos(6439), 4);
	}
	
	@Test
	void voltea() {
		assertEquals(Ejercicio01_al_14_08.voltea(64398), 89346);
	}
	
	@Test
	void digitoN() {
		assertEquals(Ejercicio01_al_14_08.digitoN(64398, 0), 6);
	}

	@Test
	void posicionDeDigitoEncontrado() {
		assertEquals(Ejercicio01_al_14_08.posicionDeDigito(64398, 9), 3);
		assertEquals(Ejercicio01_al_14_08.posicionDeDigito(64398, 7), -1);
	}
	
	@Test
	void quitaPorDetras() {
		assertEquals(Ejercicio01_al_14_08.quitaPorDetras(6439823, 1), 643982);
	}
	
	@Test
	void quitaPorDelante() {
		assertEquals(Ejercicio01_al_14_08.quitaPorDelante(6439823, 1), 439823);
	}
	
	
}
