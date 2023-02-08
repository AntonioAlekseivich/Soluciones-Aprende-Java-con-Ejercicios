package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio01_09;

public class CaballoMain {

	public static void main(String[] args) {
		Caballo pegaso = new Caballo("macho", "blanco", 1000);
		Caballo rudolf = new Caballo("macho", "marron", 40);
		Caballo platero = new Caballo("macho", "gris", 3);
		
		pegaso.trota();
		platero.come();
		rudolf.galopa();
		platero.camina();
		pegaso.galopa();
		rudolf.relincha();
		
		pegaso.localizador();
		rudolf.localizador();
		platero.localizador();

	}

}
