package unidad_09_ProgramacionOrientadaAObjetos.Arrays.Ejercicio05_09;
import java.util.ArrayList;
import java.util.Scanner;
public class Gestisimal {
    //Hecho por chatgpt
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Articulo> almacen = new ArrayList<>();

            while (true) {
                System.out.println("\nMenú:");
                System.out.println("1. Listado");
                System.out.println("2. Alta");
                System.out.println("3. Baja");
                System.out.println("4. Modificación");
                System.out.println("5. Entrada de mercancía");
                System.out.println("6. Salida de mercancía");
                System.out.println("7. Salir");
                System.out.print("Elija una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer de entrada

                switch (opcion) {
                    case 1:
                        listarArticulos(almacen);
                        break;
                    case 2:
                        altaArticulo(scanner, almacen);
                        break;
                    case 3:
                        bajaArticulo(scanner, almacen);
                        break;
                    case 4:
                        modificarArticulo(scanner, almacen);
                        break;
                    case 5:
                        entradaMercancia(scanner, almacen);
                        break;
                    case 6:
                        salidaMercancia(scanner, almacen);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        return;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        }

        private static void listarArticulos(ArrayList<Articulo> almacen) {
            System.out.println("\nListado de artículos:");
            for (Articulo articulo : almacen) {
                System.out.println(articulo);
            }
        }

        private static void altaArticulo(Scanner scanner, ArrayList<Articulo> almacen) {
            System.out.println("\nAlta de artículo:");
            System.out.print("Código: ");
            String codigo = scanner.nextLine();
            System.out.print("Descripción: ");
            String descripcion = scanner.nextLine();
            System.out.print("Precio de compra: ");
            double precioCompra = scanner.nextDouble();
            System.out.print("Precio de venta: ");
            double precioVenta = scanner.nextDouble();
            System.out.print("Stock: ");
            int stock = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de entrada

            Articulo articulo = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
            almacen.add(articulo);
            System.out.println("Artículo dado de alta correctamente.");
        }

        private static void bajaArticulo(Scanner scanner, ArrayList<Articulo> almacen) {
            System.out.println("\nBaja de artículo:");
            System.out.print("Ingrese el código del artículo a dar de baja: ");
            String codigo = scanner.nextLine();

            for (int i = 0; i < almacen.size(); i++) {
                if (almacen.get(i).getCodigo().equals(codigo)) {
                    almacen.remove(i);
                    System.out.println("Artículo dado de baja correctamente.");
                    return;
                }
            }
            System.out.println("No se encontró ningún artículo con ese código.");
        }

        private static void modificarArticulo(Scanner scanner, ArrayList<Articulo> almacen) {
            System.out.println("\nModificación de artículo:");
            System.out.print("Ingrese el código del artículo a modificar: ");
            String codigo = scanner.nextLine();

            for (Articulo articulo : almacen) {
                if (articulo.getCodigo().equals(codigo)) {
                    System.out.print("Nuevo precio de compra (0 para mantener el actual): ");
                    double precioCompra = scanner.nextDouble();
                    if (precioCompra != 0) {
                        articulo.setPrecioCompra(precioCompra);
                    }

                    System.out.print("Nuevo precio de venta (0 para mantener el actual): ");
                    double precioVenta = scanner.nextDouble();
                    if (precioVenta != 0) {
                        articulo.setPrecioVenta(precioVenta);
                    }

                    System.out.print("Nuevo stock (0 para mantener el actual): ");
                    int stock = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer de entrada
                    if (stock != 0) {
                        articulo.setStock(stock);
                    }

                    System.out.println("Artículo modificado correctamente.");
                    return;
                }
            }
            System.out.println("No se encontró ningún artículo con ese código.");
        }

        private static void entradaMercancia(Scanner scanner, ArrayList<Articulo> almacen) {
            System.out.println("\nEntrada de mercancía:");
            System.out.print("Ingrese el código del artículo: ");
            String codigo = scanner.nextLine();

            for (Articulo articulo : almacen) {
                if (articulo.getCodigo().equals(codigo)) {
                    System.out.print("Cantidad a ingresar: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer de entrada

                    articulo.aumentarStock(cantidad);
                    System.out.println("Mercancía ingresada correctamente.");
                    return;
                }
            }
            System.out.println("No se encontró ningún artículo con ese código.");
        }

        private static void salidaMercancia(Scanner scanner, ArrayList<Articulo> almacen) {
            System.out.println("\nSalida de mercancía:");
            System.out.print("Ingrese el código del artículo: ");
            String codigo = scanner.nextLine();

            for (Articulo articulo : almacen) {
                if (articulo.getCodigo().equals(codigo)) {
                    System.out.print("Cantidad a retirar: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer de entrada

                    if (articulo.getStock() >= cantidad) {
                        articulo.disminuirStock(cantidad);
                        System.out.println("Mercancía retirada correctamente.");
                    } else {
                        System.out.println("No hay suficiente stock para realizar la operación.");
                    }
                    return;
                }
            }
            System.out.println("No se encontró ningún artículo con ese código.");
        }
    }

    class Articulo {
        private String codigo;
        private String descripcion;
        private double precioCompra;
        private double precioVenta;
        private int stock;

        public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
            this.codigo = codigo;
            this.descripcion = descripcion;
            this.precioCompra = precioCompra;
            this.precioVenta = precioVenta;
            this.stock = stock;
        }

        public String getCodigo() {
            return codigo;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public double getPrecioCompra() {
            return precioCompra;
        }

        public void setPrecioCompra(double precioCompra) {
            this.precioCompra = precioCompra;
        }

        public double getPrecioVenta() {
            return precioVenta;
        }

        public void setPrecioVenta(double precioVenta) {
            this.precioVenta = precioVenta;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public void aumentarStock(int cantidad) {
            this.stock += cantidad;
        }

        public void disminuirStock(int cantidad) {
            this.stock -= cantidad;

        }
        }
