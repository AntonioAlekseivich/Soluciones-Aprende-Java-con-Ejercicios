package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio09_09;
import java.text.DecimalFormat;

    public class Movil extends Terminal {
        private String tarifa;

        public Movil(String numero, String tarifa) {
            super(numero);
            this.tarifa = tarifa;
        }

        public String getTarifa() {
            return tarifa;
        }

        public void setTarifa(String tarifa) {
            this.tarifa = tarifa;
        }

        @Override
        public void llama(Terminal terminalDestino, int segundos) {
            super.llama(terminalDestino, segundos);

            double costeLlamada = 0;
            switch (tarifa) {
                case "rata":
                    costeLlamada = segundos * 0.06;
                    break;
                case "mono":
                    costeLlamada = segundos * 0.12;
                    break;
                case "bisonte":
                    costeLlamada = segundos * 0.30;
                    break;
            }

            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Coste de la llamada: " + df.format(costeLlamada) + " euros");
        }

    }
