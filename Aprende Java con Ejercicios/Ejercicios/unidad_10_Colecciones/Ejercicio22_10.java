package unidad_10_Colecciones;
import java.util.ArrayList;
import java.util.List;
public class Ejercicio22_10 {
    /*
    Amplía el ejercicio 13 del capítulo anterior que implementaba cuentas corrientes
de un banco de tal forma que cada cuenta lleve un registro de todos
los movimientos realizados: ingresos, cargos y transferencias (tanto enviadas
como recibidas).
     */

    //Hecho por chatGpt
    static class Movimiento {
        private String tipo;
        private double cantidad;

        public Movimiento(String tipo, double cantidad) {
            this.tipo = tipo;
            this.cantidad = cantidad;
        }

        @Override
        public String toString() {
            return tipo + ": " + cantidad;
        }
    }

    public static class CuentaCorriente {
        private double saldo;
        private List<Movimiento> movimientos;

        public CuentaCorriente() {
            saldo = 0;
            movimientos = new ArrayList<>();
        }

        public CuentaCorriente(double saldoInicial) {
            saldo = saldoInicial;
            movimientos = new ArrayList<>();
        }

        public void ingreso(double cantidad) {
            saldo += cantidad;
            movimientos.add(new Movimiento("Ingreso", cantidad));
        }

        public void cargo(double cantidad) {
            saldo -= cantidad;
            movimientos.add(new Movimiento("Cargo", cantidad));
        }

        public void transferencia(CuentaCorriente destino, double cantidad) {
            if (this.saldo >= cantidad) {
                this.saldo -= cantidad;
                destino.saldo += cantidad;
                movimientos.add(new Movimiento("Transferencia enviada", cantidad));
                destino.movimientos.add(new Movimiento("Transferencia recibida", cantidad));
            } else {
                System.out.println("Saldo insuficiente para realizar la transferencia.");
            }
        }

        public void movimientos() {
            System.out.println("Registro de movimientos:");
            for (Movimiento movimiento : movimientos) {
                System.out.println(movimiento);
            }
        }

        public double getSaldo() {
            return saldo;
        }
    }
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente(1500);
        CuentaCorriente cuenta3 = new CuentaCorriente(6000);

        cuenta1.ingreso(2000);
        cuenta1.cargo(600);
        cuenta3.ingreso(75);
        cuenta1.cargo(55);
        cuenta2.transferencia(cuenta1, 100);
        cuenta1.transferencia(cuenta3, 250);
        cuenta3.transferencia(cuenta1, 22);

        cuenta1.movimientos();
    }

}
