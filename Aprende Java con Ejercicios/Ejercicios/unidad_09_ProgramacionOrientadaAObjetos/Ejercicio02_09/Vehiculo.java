package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio02_09;

public abstract class Vehiculo {

	//Atributos
	
	//clase
	public static int vehiculosCreados = 0;
	public static int kilometrosTotales = 0;

	//instancia
	public String propietario; 
	public int kilometrosRecorridos;

	
	//Metodos
	void verKilometrajeTotal() {
		
		System.out.println("\nKilometros recorridos en total: "+kilometrosTotales);
		
	}
	
}
