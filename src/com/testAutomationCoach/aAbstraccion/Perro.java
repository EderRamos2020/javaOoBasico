package com.testAutomationCoach.aAbstraccion;

import com.testAutomationCoach.libs.Input;

public class Perro {
    //variables de instancia, tamano, raza, nombre
    public double tamanio;
    public String raza;
    public String nombre;
    public double edad;


    //comportamiento: ladrar, juguetear, comer, etc.

    public void ladrar()
    {
        Input.print("guau guau guau");
    }

    public void correr()
    {
        Input.print("ras ras ras");
    }

    public void comer()
    {
        Input.print("chaw chaw chaw");
    }

    public String habilidad (double edad, String raza)
    {
        if (edad > 0 && edad < 6)
        {
            if (raza.equals("labrador") || raza.equals("biggle"))
            {
                System.out.println("es mordelon ");
            }
            else
            {
                System.out.println("es jugueton ");
            }
        }
        else if (edad > 5 && edad < 11)
            {
                if (raza.equals("pastor aleman") || raza.equals("Dóberman") || raza.equals("rottweiler"))
                {
                System.out.println("es olfateador de narcoticos ");
                }
                else
                {
                System.out.println("es guia de personas discapacitadas ");
                }
            }
            else
            {
                System.out.println("es cuidador de hogares");
            }

        return null;

    }
}
