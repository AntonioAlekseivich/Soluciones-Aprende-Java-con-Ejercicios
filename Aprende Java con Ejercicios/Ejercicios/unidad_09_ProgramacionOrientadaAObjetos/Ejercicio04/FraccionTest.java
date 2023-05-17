package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import unidad_08_Funciones.Ejercicio01_al_14_08;

class FraccionTest {

	@Test
	void invierteTest() {
		int [] expected = {3,4};
		int [] result = Fraccion.invierte(4,3);
        assertArrayEquals(expected, result);
	}
	@Test
	void simplificaTest() {
		int [] expected = {1,2};
		int [] result = Fraccion.simplifica(8,16);
        assertArrayEquals(expected, result);
	}
	@Test
	void simplificaTest2() {
		int [] expected = {1,3};
		int [] result = Fraccion.simplifica(3,9);
        assertArrayEquals(expected, result);
	}
	@Test
	void multiplica() {
		assertEquals(Fraccion.multiplica(6,5),30);
	}
}
