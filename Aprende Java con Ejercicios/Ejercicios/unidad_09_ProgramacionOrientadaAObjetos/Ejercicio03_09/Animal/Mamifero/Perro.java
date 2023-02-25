package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio03_09.Animal.Mamifero;

public class Perro extends Mamifero{
	//Constructor
		public Perro(String p){
			this.nombre = p;
		}
	
	//Metodos
		//clase
		void ladra() {}
		public void muerde() {
			System.out.println("\n*perro muerde*");
		}
		void sentarse() {}	
}
