package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio16_09;

public class Linea {
    //ChatGpt

    private Punto puntoInicio;
    private Punto puntoFin;

    public Linea(Punto puntoInicio, Punto puntoFin) {
        this.puntoInicio = puntoInicio;
        this.puntoFin = puntoFin;
    }

    public Punto getPuntoInicio() {
        return puntoInicio;
    }

    public Punto getPuntoFin() {
        return puntoFin;
    }

    @Override
    public String toString() {
        return "Linea de " + puntoInicio + " a " + puntoFin;
    }
}
