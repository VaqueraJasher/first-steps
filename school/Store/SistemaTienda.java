/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

/**
 *
 * @author Your Name Jasher Abraham Carrazco Vaquera
 */
public class SistemaTienda {
    public Inventario inventario;
    public InterfazUsuario interfazUsuario;

    public SistemaTienda() {
        this.inventario = new Inventario();
        this.interfazUsuario = new InterfazUsuario();
    }

    public void registrarProducto(String nombre, String codigoProducto, double precio, int cantidadEnStock) {
        Producto nuevoProducto = new Producto(nombre, codigoProducto, precio, cantidadEnStock);
        inventario.agregarProducto(nuevoProducto);
    }

    public Producto consultarInventario(String codigoProducto) {
        Producto producto = inventario.consultarInventario(codigoProducto);
        // Imprimir información del producto o manejar según sea necesario
        return producto;
    }

    public String generarReporteInventario() {
        String reporte = inventario.generarReporteInventario();
        // Imprimir o manejar el reporte según sea necesario
        return reporte;
    }

    public String generarReporteExistenciasBajas() {
        String reporte = inventario.generarReporteExistenciasBajas();
        // Imprimir o manejar el reporte según sea necesario
        return reporte;
    }

    public void iniciarInterfazUsuario() {
        interfazUsuario.mostrarMenu();
        // Implementa la lógica de interacción con la interfaz de usuario
    }
}

