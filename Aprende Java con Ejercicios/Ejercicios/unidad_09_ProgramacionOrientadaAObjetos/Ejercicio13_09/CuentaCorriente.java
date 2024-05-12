package unidad_09_ProgramacionOrientadaAObjetos.Ejercicio13_09;

import java.text.DecimalFormat;
import java.util.Random;

public class CuentaCorriente {
    //ChatGpt
        private String numeroCuenta;
        private double saldo;

        public CuentaCorriente() {
            this.numeroCuenta = generarNumeroCuenta();
            this.saldo = 0;
        }

        public CuentaCorriente(double saldoInicial) {
            this.numeroCuenta = generarNumeroCuenta();
            this.saldo = saldoInicial;
        }

        public void ingreso(double cantidad) {
            saldo += cantidad;
        }

        public void cargo(double cantidad) {
            saldo -= cantidad;
        }

        public void transferencia(CuentaCorriente cuentaDestino, double cantidad) {
            saldo -= cantidad;
            cuentaDestino.ingreso(cantidad);
        }

        private String generarNumeroCuenta() {
            Random random = new Random();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                sb.append(random.nextInt(10));
            }
            return sb.toString();
        }

        public String getNumeroCuenta() {
            return numeroCuenta;
        }

        public double getSaldo() {
            return saldo;
        }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "Número de cta: " + numeroCuenta + " Saldo: " + df.format(saldo) + " €";
    }
}
