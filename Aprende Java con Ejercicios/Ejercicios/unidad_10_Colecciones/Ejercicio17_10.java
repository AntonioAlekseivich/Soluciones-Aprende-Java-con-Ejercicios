package unidad_10_Colecciones;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio17_10 {
//HEcho por chatGpt

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


    public static void main(String[] args) {
        Carrito miCarrito = new Carrito();
        miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 2));
        miCarrito.agrega(new Elemento("Canon EOS 2000D", 449, 1));
        System.out.println(miCarrito);
        System.out.print("Hay " + miCarrito.numeroDeElementos());
        System.out.println(" productos en la cesta.");
        System.out.println("El total asciende a " + String.format("%.2f", miCarrito.importeTotal()) + " euros");

        System.out.println("\nContinúa la compra...\n");

        miCarrito.agrega(new Elemento("Samsung Galaxy Tab", 199, 3));
        miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 1));
        System.out.println(miCarrito);
        System.out.print("Ahora hay " + miCarrito.numeroDeElementos());
        System.out.println(" productos en la cesta.");
        System.out.println("El total asciende a " + String.format("%.2f", miCarrito.importeTotal()) + " euros");
    }



}

