package unidad_10_Colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ejercicio15_10 {

        public static void main(String[] args) {
            Map<String, Double> preciosProductos = new HashMap<>();
            preciosProductos.put("avena", 2.21);
            preciosProductos.put("garbanzos", 2.39);
            preciosProductos.put("tomate", 1.59);
            preciosProductos.put("jengibre", 3.13);
            preciosProductos.put("quinoa", 4.50);
            preciosProductos.put("guisantes", 1.60);

            Map<String, Integer> compraProductos = new HashMap<>();
            double total = 0.0;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido al supermercado de productos ecológicos.");
            System.out.println("Por favor, introduce los productos que deseas comprar y la cantidad.");
            System.out.println("Cuando hayas terminado, escribe 'fin' para finalizar la compra.");

            while (true) {
                System.out.print("Producto: ");
                String producto = scanner.nextLine().toLowerCase();
                if (producto.equals("fin")) {
                    break;
                }
                if (!preciosProductos.containsKey(producto)) {
                    System.out.println("Error: Producto no disponible.");
                    continue;
                }
                System.out.print("Cantidad: ");
                int cantidad = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada

                compraProductos.put(producto, compraProductos.getOrDefault(producto, 0) + cantidad);
            }

            System.out.println("Introduce el código de descuento (si no tienes ninguno, deja en blanco): ");
            String codigoDescuento = scanner.nextLine();
            double descuento = 0.0;
            if (codigoDescuento.equals("ECODTO")) {
                descuento = 0.10; // 10% de descuento
            }

            System.out.println("\nProducto   Precio   Cantidad   Subtotal");
            System.out.println("----------------------------------------");
            for (Map.Entry<String, Integer> entry : compraProductos.entrySet()) {
                String producto = entry.getKey();
                int cantidad = entry.getValue();
                double precioUnitario = preciosProductos.get(producto);
                double subtotal = precioUnitario * cantidad;
                total += subtotal;
                System.out.printf("%-10s %7.2f€ %9d %11.2f€%n", producto, precioUnitario, cantidad, subtotal);
            }
            System.out.println("----------------------------------------");
            System.out.printf("TOTAL: %.2f€%n", total);
            if (descuento > 0) {
                double descuentoAplicado = total * descuento;
                total -= descuentoAplicado;
                System.out.printf("Descuento (%d%%): -%.2f€%n", (int) (descuento * 100), descuentoAplicado);
                System.out.printf("TOTAL (con descuento): %.2f€%n", total);
            }
        }
    }

