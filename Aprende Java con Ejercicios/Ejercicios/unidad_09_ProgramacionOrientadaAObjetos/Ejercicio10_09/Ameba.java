package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio10_09;


    public class Ameba {
        //Chatgpt
        private int peso;

        public Ameba() {
            this.peso = 3; // Peso inicial de una ameba nueva
        }

        public void come(int microgramos) {
            this.peso += microgramos - 1; // Incrementa el peso de la ameba (gasta 1 microgramo en el proceso)
        }

        public void come(Ameba otraAmeba) {
            this.peso += otraAmeba.peso - 1; // Incrementa el peso de la ameba con el peso de la otra ameba (gasta 1 microgramo en el proceso)
            otraAmeba.peso = 0; // La otra ameba se queda con un peso de 0 microgramos
        }

        @Override
        public String toString() {
            return "Soy una ameba y peso " + peso + " microgramos.";
        }
}
