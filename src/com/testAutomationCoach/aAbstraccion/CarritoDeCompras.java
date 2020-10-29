package com.testAutomationCoach.aAbstraccion;

public class CarritoDeCompras {

    public double tamano;
    public String color;
    public double factura;
    public int idCarrito;
    public String[] descripcionProductos;
    public int[] idProductos;

    public double cargarCarrito(int idcarrito, int[] productos, String[] descripcionProductos)
    {
     return factura;
    }

    public double vaciarCarrito (int idcarrito)
    {
        return factura;
    }

    public int agregarCarrito()
    {
        return idCarrito;
    }

    public void eliminarCarrito(int idcarrito)
    {
        this.idCarrito = idcarrito;
        String mensaje = "Carrito "+idCarrito+" eliminado ";
        System.out.println(mensaje);
    }




}
