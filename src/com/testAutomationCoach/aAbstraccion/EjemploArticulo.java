package com.testAutomationCoach.aAbstraccion;

import com.testAutomationCoach.libs.Input;

public class EjemploArticulo {

    public static void main(String[] args) {

        Articulo maleta = new Articulo();

        maleta.referencia = 0;
        maleta.marca = "";
        maleta.color="";
        maleta.peso=0;
        maleta.precioUnitario=0;

        maleta=costoTotal(maleta,90000, 5, 101, "totto");
        Input.print("Valor total "+maleta.precioTotal+"\n\n");

        Articulo hogar = new Articulo();
        hogar.iva=0.19;
        double[] datos=impuestos(hogar, maleta.precioUnitario,maleta.precioTotal, maleta.cantidad, hogar.iva);
        int i=0;
        while(i<datos.length)
        {
            System.out.println(" "+datos[i]);
            i++;
        }


    }

    public static Articulo costoTotal(Articulo cosa, int valorUnidad, int cantidad, int referencia, String marca)
    {
        cosa.alquilarArticulo(marca, referencia, valorUnidad);
        cosa.precioUnitario=valorUnidad;
        cosa.cantidad=cantidad;
        cosa.precioTotal=valorUnidad * cantidad;
        cosa.referencia=referencia+1000;

        return cosa;
    }

    private static double[] impuestos(Articulo hogar1, double precioUnitario, double precioTotal, int cantidad, double iva)
    {
        double ivaUnitario =precioUnitario * iva;
        hogar1.iva = ivaUnitario * cantidad;
        hogar1.precioTotal=precioTotal + hogar1.iva;
        return new double[] {hogar1.iva, hogar1.precioTotal};
    }
}
