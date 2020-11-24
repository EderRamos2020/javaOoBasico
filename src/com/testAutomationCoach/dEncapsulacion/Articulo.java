package com.testAutomationCoach.dEncapsulacion;
import com.testAutomationCoach.Selenium.Image;
import java.util.Random;

public class Articulo {

    private String fabr;
    private String refe;
    private String imagen;
    private String descripcion;
    private double precio;
    private int cant;
    private double porcenIva;


    public Articulo ()
    {
        refe="default";
        fabr = "default";
        descripcion= "default";
        precio= 0;

    }

    public void exisBodega(String refe, String fabr)
    {
        this.refe=refe;
        this.fabr=fabr;
        Random obExist = new Random();
        int cantExis=obExist.nextInt(9999);
        System.out.println("De la referencia "+refe+" hay "+cantExis);
    }

    public void ingresarIva(double iva)
    {
        this.porcenIva=iva;
    }

    public double precioSubTotal(int cant, double precio)
    {
        this.cant=cant;
        double subtotal=this.cant*precio;
        return subtotal;
    }

    public double iva(double total)
    {
        double valorIva=this.porcenIva*total;
        return valorIva;
    }

    public double precioTotal(double subtotal, double valorIva)
    {
        double valorTotal=valorIva+subtotal;
        return valorTotal;
    }



}
