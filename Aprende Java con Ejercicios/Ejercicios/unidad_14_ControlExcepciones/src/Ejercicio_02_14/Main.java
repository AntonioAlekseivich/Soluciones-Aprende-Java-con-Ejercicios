package Ejercicio_02_14;
import Ejercicio_02_14.ExcepcionApareamientoImposible;
import Ejercicio_02_14.Gato;

public class Main {

	    public static void main(String[] args) {
	        Gato garfield = new Gato("Garfield", "macho");
	        Gato lisa = new Gato("Lisa", "hembra");
	        Gato tom = new Gato("Tom", "macho");

	        try {
	            Gato cria = garfield.apareaCon(lisa);
	            System.out.println("Nueva cría: " + cria.getNombre() + ", Sexo: " + cria.getSexo());
	        } catch (ExcepcionApareamientoImposible e) {
	            System.out.println(e.getMessage());
	        }

	        try {
	            Gato cria = garfield.apareaCon(tom);
	            System.out.println("Nueva cría: " + cria.getNombre() + ", Sexo: " + cria.getSexo());
	        } catch (ExcepcionApareamientoImposible e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}


