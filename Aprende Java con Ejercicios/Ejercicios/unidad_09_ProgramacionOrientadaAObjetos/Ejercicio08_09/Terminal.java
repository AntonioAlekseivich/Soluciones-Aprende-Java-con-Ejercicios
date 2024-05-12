package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio08_09;

    public class Terminal {
        //Chatgpt
        private String numero;
        private int tiempoConversacion;

        public Terminal(String numero) {
            this.numero = numero;
            this.tiempoConversacion = 0;
        }

        public String getNumero() {
            return numero;
        }

        public int getTiempoConversacion() {
            return tiempoConversacion;
        }

        public void setTiempoConversacion(int tiempoConversacion) {
            this.tiempoConversacion = tiempoConversacion;
        }

        public void llama(Terminal terminalDestino, int segundos) {
            this.tiempoConversacion += segundos;
            terminalDestino.setTiempoConversacion(terminalDestino.getTiempoConversacion() + segundos);
        }

        @Override
        public String toString() {
            return "Nº " + numero + " - " + tiempoConversacion + "s de conversación";
        }
}
