package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio02_09;

public class Bicicleta extends Vehiculo {

	//Metodos

	//Constructor
	Bicicleta(String p){
		this.propietario = p;
	}

	//Anda
	void anda(){
		this.kilometrosRecorridos = this.kilometrosRecorridos + 2;
		kilometrosTotales = kilometrosTotales + 2;
		System.out.println("\n*La bici avanza*");
	}

	//Caballito
	void caballito(){
		System.out.println("\n*Procede a hacer un caballito*");
		this.kilometrosRecorridos = this.kilometrosRecorridos + 3;
		kilometrosTotales = kilometrosTotales + 3;
	}

	//Ver quilometraje de la bicicleta
	void kilometrajeBici() {
		System.out.println("\nKilometros recorridos en bicicleta: "+kilometrosRecorridos);
	}

}
