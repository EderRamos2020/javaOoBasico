package com.testAutomationCoach.aAbstraccion;

public class Articulo {

    public int referencia;
    public int calificacion;
    public String marca;
    public String descripcion;
    public String color;
    public double tamano;
    public double peso;
    public double precio;

    public void alquilarArticulo(String marca, int referencia, double precio)
    {
        System.out.println("Articulo alquilado");
    }

    public void comprarArticulo(String marca, int referencia, double precio, String descripcion)
    {
        libs.Input.print("Articulo comprado");
    }

    public void cotizarArticulo(int referencia, double precio, String marca, String color)
    {
        System.out.println("Articulo comprado");
    }

}
