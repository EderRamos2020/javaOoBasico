package com.testAutomationCoach.aAbstraccion;

import com.testAutomationCoach.libs.Input;

public class EjemploCancion {



    public static void main(String[] args) {

        Cancion lasMañanitas = new Cancion();
        lasMañanitas.cantante = "Vicente Fernandez";
        lasMañanitas.titulo = "En andariego";
        lasMañanitas.duracion = 15;

        Alarma objeto = new Alarma();
        objeto.mensaje = objeto.sonar(2,3,5);
        Input.print(objeto.mensaje);

        CarritoDeCompras coche = new CarritoDeCompras();
        coche.eliminarCarrito(8080);


        cambiarArtista(lasMañanitas, "maluma");

        Cancion laNoche = new Cancion();
        String nuevoTitulo="cruz del monte";
        cambiarTitulo(laNoche, nuevoTitulo);


        lasMañanitas=null;
    }

    public static void cambiarArtista (Cancion objeto1, String nuevocantante)
    {
        objeto1.cantante=nuevocantante;
    }

    private static void cambiarTitulo(Cancion cancionX, String nuevoTitulo2)
    {
        cancionX.titulo=nuevoTitulo2;
    }
}


