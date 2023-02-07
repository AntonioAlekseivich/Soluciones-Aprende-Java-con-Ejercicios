package unidad_08_Funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFunciones {

	@Test
	void getArray() {//este primer test lo escribio chatGPT.
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
	
	@Test
	void pegaPorDetras() {
		assertEquals(Ejercicio01_al_14_08.pegaPorDetras(6439823, 6), 64398236);
	}
	
	@Test
	void pegaPorDelante() {
		assertEquals(Ejercicio01_al_14_08.pegaPorDelante(64398, 436), 43664398);
	}
	
	@Test
	void trozoDeNumero() {
		assertEquals(Ejercicio01_al_14_08.trozoDeNumero(6439832, 2, 6), 43983);
		assertEquals(Ejercicio01_al_14_08.trozoDeNumero(6439832, 3, 9), -1);
		assertEquals(Ejercicio01_al_14_08.trozoDeNumero(6439832, 5, 4), -1);
	}
	
	@Test
	void juntaNumeros() {
		assertEquals(Ejercicio01_al_14_08.juntaNumeros(6, 436), 6436);
	}
}
