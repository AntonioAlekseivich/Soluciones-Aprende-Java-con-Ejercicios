package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio12_09;

public class Publicacion {
    private String ISBN;
    private String titulo;
    private int anioPublicacion;


 public Publicacion(String ISBN, String titulo, int anioPublicacion) {
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.anioPublicacion = this.anioPublicacion;

}

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoPublicacion() {
        return anioPublicacion;
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + ", título: " + titulo + ", año de publicación: " + anioPublicacion;
    }
}

