package com.testAutomationCoach.aAbstraccion;

import java.util.Random;

public class Pelicula {

    public double idPel;
    public String titulo;
    public double duracion;
    public String sinopsis;
    public String productora;
    public double factura;
    public int cantidad;
    public double precio;
    public int idPersona;
    public String type;
    public double valTotal;


    public static int get_idPer()
    {
        //double a= Math.random();
        Random objRan = new Random();
        int val = objRan.nextInt(9998)+1;
        System.out.println("Id "+val+" generado");
        return val;
    }

    public double seaFilm(String type)
    {
        this.type=type;
        double num=0;
        if(this.type.equals("terror") || this.type.equals("accion") || this.type.equals("comedia"))
        {
            num = Math.random()*8+1;
            System.out.println("Existe la pelicula : "+num);
        }

        return num;
    }

    public static int alquilar(double idFilm)
    {
        Random valor = new Random();
        int valFilm = valor.nextInt(30000)+10000;
        System.out.println("valor pelicula "+idFilm+" es "+valFilm);
        return valFilm;
    }

    public void premio(double idFilm, int idPer, double precio)
    {
        System.out.println(" pelicula premiada Felicitaciones!!");
    }

    public double cotizar(int id, String titulo, int cantidad)
    {
          this.factura = cantidad * precio;
          double valor = factura;
          return valor;
    }



    
}
