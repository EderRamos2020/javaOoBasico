package com.testAutomationCoach.aAbstraccion;

import com.testAutomationCoach.libs.Input;

public class Articulo {

    public int referencia;
    public int calificacion;
    public String marca;
    public String descripcion;
    public String color;
    public double tamano;
    public double peso;
    public double precioUnitario;
    public double precioTotal;
    public int cantidad;
    public double iva;

    public void alquilarArticulo(String marca, int referencia, double precio)
    {
        Input.print("Factura \n");
        System.out.println("Articulo: "+marca+" " + "\nReferencia: "+referencia+"\nPrecio: "+precio+"\n ");
    }

    public void comprarArticulo(String marca, int referencia, double precio)
    {
        Input.print("Articulo Comprado");
    }

    public void cotizarArticulo(int referencia, double precio, String marca, String color)
    {
        System.out.println("Articulo comprado");
    }

}
