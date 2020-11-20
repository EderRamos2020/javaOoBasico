package com.testAutomationCoach.aAbstraccion;
import com.testAutomationCoach.libs.Input;

public class EjemploCarrito {

    public static void main(String[] args) {



        Input.print("Digite la cantidad de productos");
        int cant = Input.get_int();
        //coche.descProd= new String[cant];



        System.out.println("max "+Double.MAX_VALUE);
        System.out.println("min "+Double.BYTES);
        System.out.println(" max int "+Integer.MAX_VALUE);
        Integer a = 1;
        Integer d =a+5;
        int b = Integer.max(d,a);
        double c = Double.sum(2,9);
        //b.byteValue();
        String f = null;
        String g = "";

        int w=Input.get_int("Digite el valor");
        System.out.println("entero "+w);
        Double z = 1.1;
        double y = Double.parseDouble("1.1");
        double v=Input.get_double();
        System.out.println("double "+v);
        //char gender = sc.next().charAt(0);


        CarritoDeCompras coche = new CarritoDeCompras();
        coche.tamano=10;
        coche.color="azul";
        int idcarr= coche.agregarCarrito();
        int[] refProd = coche.cargarCarrito(idcarr);
        String[] borrarProd = coche.vaciarCarrito(idcarr, refProd);
        coche.eliminarCarrito(idcarr);
        coche.carritos = nomCarr();


    }
    public static String[] nomCarr()
    {

        int car = Input.get_int("Cuantos carritos ? : ");
        String[] nomCar1 = new String[car];
        int i=0;
        while(i<nomCar1.length)
        {
            System.out.println("Nombre del carrito: ");
            nomCar1[i] = Input.get_string();
            i++;
        }
        return nomCar1;
    }

}
