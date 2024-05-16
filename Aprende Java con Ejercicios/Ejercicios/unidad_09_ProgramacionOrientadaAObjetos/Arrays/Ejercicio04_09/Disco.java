package unidad_09_ProgramacionOrientadaAObjetos.Arrays.Ejercicio04_09;

import java.util.Objects;

public class Disco {
    public static final int MAX_DISCOS = 10; // Definir el número máximo de discos

    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;

    public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                ", Autor: " + autor +
                ", Título: " + titulo +
                ", Género: " + genero +
                ", Duración: " + duracion + " minutos";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disco disco = (Disco) o;
        return Objects.equals(codigo, disco.codigo) && Objects.equals(titulo, disco.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, titulo);
    }
}
