package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio14y15_09;

public class FichaDomino {
    //ChatgGpt
    private int ladoA;
    private int ladoB;

    public FichaDomino(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    public int getLadoA() {
        return ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public FichaDomino voltea() {
        return new FichaDomino(ladoB, ladoA);
    }

    public boolean encaja(FichaDomino otraFicha) {
        return this.ladoA == otraFicha.ladoA || this.ladoA == otraFicha.ladoB ||
                this.ladoB == otraFicha.ladoA || this.ladoB == otraFicha.ladoB;
    }

    @Override
    public String toString() {
        String ladoAString = (ladoA == 0) ? " " : String.valueOf(ladoA);
        String ladoBString = (ladoB == 0) ? " " : String.valueOf(ladoB);
        return "[" + ladoAString + " | " + ladoBString + "]";

    }


}
