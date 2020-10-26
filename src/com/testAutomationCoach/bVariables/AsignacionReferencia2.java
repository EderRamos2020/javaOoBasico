package com.testAutomationCoach.bVariables;
import com.testAutomationCoach.aAbstraccion.Button;
import com.testAutomationCoach.aAbstraccion.Cancion;

public class AsignacionReferencia2 {

    public static void main(String[] args) {

        Button cuadrado = new Button();
        Button redondo = new Button();

        Button x = cuadrado;
        Button y = new Button();

        y = redondo;

        cuadrado = null;
        x=cuadrado;

        Cancion Infinity =  new Cancion ();



    }
}
