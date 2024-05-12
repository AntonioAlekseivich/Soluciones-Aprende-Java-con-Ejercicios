package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio18_09;

public class Incidencia {
    private static int contador = 0;
    private int codigo;
    private int puesto;
    private String descripcion;
    private String estado;

    private static int pendientes = 0;

    public Incidencia(int puesto, String descripcion) {
        this.codigo = ++contador;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.estado = "pendiente";
        pendientes++;
    }

    public void resuelve(String solucion) {
        this.estado = "resuelta";
        this.descripcion += " - " + solucion;
        pendientes--;
    }

    public static int getPendientes() {
        return pendientes;
    }

    @Override
    public String toString() {
        return "Incidencia " + codigo + " - Puesto: " + puesto + " - " + descripcion + " - " + estado;
    }
}