/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ProyectoFinal;
import java.util.ArrayList;

/**
 *
 * @author Your Name Jasher Abraham Carrazco Vaquera
 */

public class Inventario {
    public ArrayList<Producto> listaProductos;

    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public Producto consultarInventario(String codigoProducto) {
        for (Producto producto : listaProductos) {
            if (producto.getCodigoProducto().equals(codigoProducto)) {
                return producto;
            }
        }
        return null; // Producto no encontrado
    }

    public String generarReporteInventario() {
        // Implementa la generación de reporte de inventario
        return "Reporte de Inventario";
    }

     public String generarReporteExistenciasBajas() {
        if (CantidadEnStock<50) {
            System.out.println("We are running out of stock, please restock soon!");
        } else {
            System.out.println("We have enough stock, no need to restock yet.");
        }
        return string;
    
    }
    // Ver el inventario
public void imprimirInventario() {
    System.out.println("===== Inventario Actual =====");
    for (Producto producto : listaProductos) {
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Código: " + producto.getCodigoProducto());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad en Stock: " + producto.getCantidadEnStock());
        System.out.println("------------------------------");
    }
}

}

