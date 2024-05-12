package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio12_09;

public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro(String ISBN, String titulo, int añoPublicacion) {
        super(ISBN, titulo, añoPublicacion);
        this.prestado = false;
    }

    @Override
    public void presta() {
        if (!prestado) {
            prestado = true;
            System.out.println("Libro prestado");
        } else {
            System.out.println("Libro ya prestado");
        }
    }

    @Override
    public void devuelve() {
        if (prestado) {
            prestado = false;
            System.out.println("Libro devuelto");
        } else {
            System.out.println("El libro no estaba prestado");
        }
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        if (prestado) {
            return super.toString() + " (prestado)";
        } else {
            return super.toString() + " (no prestado)";
        }
    }
}

