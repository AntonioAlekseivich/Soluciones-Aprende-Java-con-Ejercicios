package unidad_10_Colecciones;
import java.util.ArrayList;
import java.util.List;
public class Ejercicio18_10 {
    /*
    Mejora el programa anterior (en otro proyecto diferente) de tal forma que al
intentar agregar un elemento al carrito, se compruebe si ya existe el producto
y, en tal caso, se incremente el número de unidades sin añadir un nuevo
elemento. Observa que en el programa anterior, se repetía el producto “Tarjeta
SD 64Gb” dos veces en el carrito. En esta nueva versión ya no sucede esto, si
no que se incrementa el número de unidades del producto que se agrega.
El contenido del main es idéntico al ejercicio anterior.
     */

    //Hecho por chatGpt
    static class Elemento {
        private String nombre;
        private double precio;
        private int cantidad;

        public Elemento(String nombre, double precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void incrementarCantidad(int cantidad) {
            this.cantidad += cantidad;
        }

        @Override
        public String toString() {
            return nombre + " - Precio: " + precio + " euros - Cantidad: " + cantidad;
        }
    }

    static class Carrito {
        private List<Elemento> elementos;

        public Carrito() {
            this.elementos = new ArrayList<>();
        }

        public void agrega(Elemento elemento) {
            for (Elemento e : elementos) {
                if (e.getNombre().equals(elemento.getNombre())) {
                    e.incrementarCantidad(elemento.getCantidad());
                    return;
                }
            }
            elementos.add(elemento);
        }

        public int numeroDeElementos() {
            return elementos.size();
        }

        public double importeTotal() {
            double total = 0.0;
            for (Elemento elemento : elementos) {
                total += elemento.getPrecio() * elemento.getCantidad();
            }
            return total;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Contenido del carrito:\n");
            for (Elemento elemento : elementos) {
                sb.append(elemento).append("\n");
            }
            return sb.toString();
        }
    }

    public class Main {
        public static void main(String[] args) {
            Ejercicio18_10.Carrito miCarrito = new Ejercicio18_10.Carrito();
            miCarrito.agrega(new Ejercicio18_10.Elemento("Tarjeta SD 64Gb", 19.95, 2));
            miCarrito.agrega(new Ejercicio18_10.Elemento("Canon EOS 2000D", 449, 1));
            System.out.println(miCarrito);
            System.out.print("Hay " + miCarrito.numeroDeElementos());
            System.out.println(" productos en la cesta.");
            System.out.println("El total asciende a " + String.format("%.2f", miCarrito.importeTotal()) + " euros");

            System.out.println("\nContinúa la compra...\n");

            miCarrito.agrega(new Ejercicio18_10.Elemento("Samsung Galaxy Tab", 199, 3));
            miCarrito.agrega(new Ejercicio18_10.Elemento("Tarjeta SD 64Gb", 19.95, 1));
            System.out.println(miCarrito);
            System.out.print("Ahora hay " + miCarrito.numeroDeElementos());
            System.out.println(" productos en la cesta.");
            System.out.println("El total asciende a " + String.format("%.2f", miCarrito.importeTotal()) + " euros");
        }
    }
}
