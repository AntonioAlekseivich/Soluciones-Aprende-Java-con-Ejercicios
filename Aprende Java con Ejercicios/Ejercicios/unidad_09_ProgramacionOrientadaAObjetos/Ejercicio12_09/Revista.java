package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio12_09;

public class Revista extends Publicacion {
        private int numero;

        public Revista(String ISBN, String titulo, int añoPublicacion, int numero) {
            super(ISBN, titulo, añoPublicacion);
            this.numero = numero;
        }

        public int getNumero() {
            return numero;
        }
    }

