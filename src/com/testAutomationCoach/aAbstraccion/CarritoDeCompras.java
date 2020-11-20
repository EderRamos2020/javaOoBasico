package com.testAutomationCoach.aAbstraccion;

import com.testAutomationCoach.libs.Input;

public class CarritoDeCompras {

    public double tamano;
    public String color;
    public double factura;
    public int idCarrito;
    public String[] descProd;
    public int[] idProd;
    public String[] carritos;
    Pelicula edadOro;

         

    public int agregarCarrito()
    {
        int cant= Input.get_int("Ingrese el numero del carrito ");
        this.idCarrito = cant;
        edadOro.idPel=0;
        edadOro.cotizar(101,"Los intocables", 3);
        return idCarrito;

    }

    public int[] cargarCarrito (int idcarrito)
    {
        this.idCarrito = idcarrito;
        int cant = Input.get_int("Digite la cantidad de productos : ");
        this.idProd = new int[cant];
        this.descProd = new String[cant];
        for(int i=0; i<idProd.length; i++)
        {
            idProd[i]=Input.get_int("Digite el No.producto : ");
            System.out.print("Digite el producto :");
            descProd[i]=Input.get_string();
        }

        return idProd;
    }

    public String[] vaciarCarrito (int idcarrito, int[] refProd)
    {
        this.idCarrito = idcarrito;
        this.idProd = refProd;
        System.out.println("Productos en el Carrito");
        for(int i=0; i<idProd.length; i++)
        {
            Input.print("Desea eliminar este producto: "+idProd[i]+" "+descProd[i]+"\n"+" s/n ");
            char r= Input.get_char();
            if(r == 's')
            {
                idProd[i]=0;
                descProd[i]="";
            }
        }
        return descProd;
    }



    public void eliminarCarrito(int idcarrito)
    {
        this.idCarrito = idcarrito;
        this.idCarrito=0;
        String mensaje = "Carrito "+idcarrito+" eliminado ";
        System.out.println(mensaje);
    }




}
