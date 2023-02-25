package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio03_09;
import unidad_09_ProgramacionOrientadaAObjetos.Ejercicio03_09.Animal.Mamifero.Gato;
import unidad_09_ProgramacionOrientadaAObjetos.Ejercicio03_09.Animal.Mamifero.Perro;

public class Main {

	public static void main(String[] args) {
		// Creacion de los objetos
		Perro balto = new Perro("balto");
		Gato garfield = new Gato("garfield");

		//Acciones del perro
			//test superclase metodo
		balto.come();
		
			//test metodo clase
		balto.muerde();//invoca a la clase
		garfield.muerde();//invoca a superclase
	}

}
