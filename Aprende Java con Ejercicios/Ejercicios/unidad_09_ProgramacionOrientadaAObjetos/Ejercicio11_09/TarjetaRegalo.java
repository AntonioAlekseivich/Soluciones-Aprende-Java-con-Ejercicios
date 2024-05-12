package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio11_09;
    import java.util.Random;

    public class TarjetaRegalo {
        //Chatgpt
        private int numero;
        private double saldo;

        public TarjetaRegalo(double saldo) {
            this.saldo = saldo;
            this.numero = generarNumero();
        }

        public int getNumero() {
            return numero;
        }

        public double getSaldo() {
            return saldo;
        }

        public void gasta(double cantidad) {
            if (cantidad > saldo) {
                System.out.println("No tiene suficiente saldo para gastar " + cantidad + "€");
            } else {
                saldo -= cantidad;
            }
        }

        public TarjetaRegalo fusionaCon(TarjetaRegalo otraTarjeta) {
            TarjetaRegalo nuevaTarjeta = new TarjetaRegalo(this.saldo + otraTarjeta.saldo);
            this.saldo = 0;
            otraTarjeta.saldo = 0;
            return nuevaTarjeta;
        }

        private int generarNumero() {
            Random random = new Random();
            return random.nextInt(90000) + 10000; // Genera un número aleatorio de 5 cifras
        }

        @Override
        public String toString() {
            return "Tarjeta nº " + numero + " - Saldo " + String.format("%.2f", saldo) + "€";
        }


    }


