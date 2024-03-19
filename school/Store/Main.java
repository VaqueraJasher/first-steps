/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

/**
 *
 * @author Your Name Jasher Abraham Carrazco Vaquera
 */
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaTienda sistemaTienda = new SistemaTienda();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            // Mostrar el menú
            System.out.println("===== TecnoStore =====");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Consultar Inventario");
            System.out.println("3. Generar Reporte de Inventario");
            System.out.println("4. Generar Reporte de Existencias Bajas");
            System.out.println("5. Consultar Inventario");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            // Capturar la opción del usuario
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después del número

            // Realizar la operación según la opción seleccionada
            switch (opcion) {
                case 1:
                    // Registrar Producto
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el código del producto: ");
                    String codigoProducto = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad en stock: ");
                    int cantidadEnStock = scanner.nextInt();

                    sistemaTienda.registrarProducto(nombre, codigoProducto, precio, cantidadEnStock);
                    System.out.println("Producto registrado con éxito.");
                    break;

                case 2:
                    // Consultar Inventario
                    System.out.print("Ingrese el código del producto a consultar: ");
                    scanner.nextLine();
                    String codigoConsulta = scanner.nextLine();
                    Producto productoConsultado = sistemaTienda.consultarInventario(codigoConsulta);

                    if (productoConsultado != null) {
                        System.out.println("Información del Producto:");
                        System.out.println("Nombre: " + productoConsultado.getNombre());
                        System.out.println("Código: " + productoConsultado.getCodigoProducto());
                        System.out.println("Precio: " + productoConsultado.getPrecio());
                        System.out.println("Cantidad en Stock: " + productoConsultado.getCantidadEnStock());
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 3:
                    // Generar Reporte de Inventario
                    System.out.println("===== Reporte de Inventario =====");
                    System.out.println(sistemaTienda.generarReporteInventario());
                    break;

                case 4:
                    // Generar Reporte de Existencias Bajas
                    System.out.println(SistemaTienda.generarReporteExistenciasBajas(CantidadEnStock));
                    break;
                case 5:
                // Imprimir Inventario
                sistemaTienda.inventario.imprimirInventario();
                break;
                case 6:
                    // Salir del programa
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}







