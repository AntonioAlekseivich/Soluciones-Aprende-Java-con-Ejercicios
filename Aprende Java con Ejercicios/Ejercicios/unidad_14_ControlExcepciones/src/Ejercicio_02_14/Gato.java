package Ejercicio_02_14;

public class Gato {
	    private String nombre;
	    private String sexo; // "macho" o "hembra"

	    public Gato(String nombre, String sexo) {
	        this.nombre = nombre;
	        this.sexo = sexo;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getSexo() {
	        return sexo;
	    }

	    // Método para aparear dos gatos
	    public Gato apareaCon(Gato pareja) throws ExcepcionApareamientoImposible {
	        if (this.sexo.equals(pareja.getSexo())) {
	            throw new ExcepcionApareamientoImposible("Apareamiento imposible entre dos gatos del mismo sexo.");
	        }

	        // Generar un nuevo gato
	        String nombreCria = "Cría de " + this.nombre + " y " + pareja.getNombre();
	        String sexoCria = Math.random() < 0.5 ? "macho" : "hembra"; // Sexo aleatorio para la cría
	        return new Gato(nombreCria, sexoCria);
	    }

}
