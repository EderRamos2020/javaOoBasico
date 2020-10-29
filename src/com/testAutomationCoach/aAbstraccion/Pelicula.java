package com.testAutomationCoach.aAbstraccion;

public class Pelicula {

    public int id;
    public String titulo;
    public double duracion;
    public String sinopsis;
    public int Año;
    public String productora;
    public double factura;
    public int cantidad;
    public double precio;
    public String idPersona;


    public double alquilar(int id, String titulo)
    {
        return factura;
    }

    public double comprar(int id, String titulo)
    {
        return factura;
    }

    public double cotizar(int id, String titulo, int cantidad)
    {
          this.factura = cantidad * precio;
          double valor = factura;
          return valor;
    }

    public void suscripcion(String idPersona)
    {
        System.out.println("Suscrito");
    }

    
}
