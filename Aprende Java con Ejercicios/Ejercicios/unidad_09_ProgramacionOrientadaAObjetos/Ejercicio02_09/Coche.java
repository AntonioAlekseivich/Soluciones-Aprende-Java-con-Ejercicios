package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio02_09;

public class Coche extends Vehiculo {

	//Metodos

	//Constructor
	Coche(String p){
		this.propietario = p;
	}

	//Anda
	void anda(){
		this.kilometrosRecorridos = this.kilometrosRecorridos + 5;
		kilometrosTotales = kilometrosTotales + 5;
		System.out.println("\n*El coche avanza*");
	}

	//Quemar rueda
	void quemarRueda(){
		System.out.println("\n*Procede a quemar rueda con el coche*");
		this.kilometrosRecorridos = this.kilometrosRecorridos + 8;
		kilometrosTotales = kilometrosTotales + 8;
	}

	//Ver quilometraje del coche
	void kilometrajeCoche() {
		System.out.println("\nKilometros recorridos en coche: "+kilometrosRecorridos);
	}
}
