package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio01_09;

public class Caballo {

	/*Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
	instancias y aplicándole algunos métodos.*/


//Atributos
	String sexo, color;
	int edad;
	int posicion = 0;

//Metodos

	//Constructor
	Caballo(String s, String c, int e){
		this.sexo = s;
		this.color = c;
		this.edad = e;
	}
	//Relincha
	void relincha(){
		System.out.println("\nIiiiii...\n");
	}

	//Camina
	void camina(){
		posicion++;
	}

	//Trota
	void trota() {
		posicion = posicion +2;
	}

	//Galopa
	void galopa () {
		posicion = posicion + 4;
	}

	//Come
	void come() {
		System.out.println("\nIiiii... !Que rico!\n");
	}

	//Localizador
	void localizador() {
		System.out.println();
		for(int i=this.posicion; i>=0; i--) {
			System.out.print("-");
		}
		System.out.println();
	}
}
