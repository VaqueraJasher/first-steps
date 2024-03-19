/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

/**
 *
 * @author Your Name Jasher Abraham Carrazco Vaquera
 */
public class Producto {
    public String nombre;
    public String codigoProducto;
    public double precio;
    public int cantidadEnStock;

    public Producto(String nombre, String codigoProducto, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.codigoProducto = codigoProducto;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int nuevaCantidad) {
        this.cantidadEnStock = nuevaCantidad;
    }
}
