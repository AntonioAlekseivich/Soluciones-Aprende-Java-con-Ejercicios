package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio03_09.Animal.Mamifero;

import unidad_09_ProgramacionOrientadaAObjetos.Ejercicio03_09.Animal.Animal;

public abstract class Mamifero extends Animal{
	//Metodos
	void acicalaPelo() {}
	public void muerde() {
		System.out.println("*animal muerde*");
	}
	void caza() {}
}
