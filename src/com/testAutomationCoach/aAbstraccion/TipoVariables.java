package com.testAutomationCoach.aAbstraccion;

public class TipoVariables {

    public static void main(String[] args) {

        String nacionalidad="paraguayo";
        int peso=55;
        long a= 789;
        short b = 8;
        byte c = 0;
        byte h = 127;
        boolean g=true;
        boolean v=false;

        Perro trosky = new Perro ();
        trosky.tamanio= 80;
        trosky.raza="pug";
        trosky.nombre="juan";

        System.out.println("nacionalidad: "+nacionalidad);
        System.out.println("peso: "+peso);
        System.out.println("nombre: "+trosky.nombre);
        System.out.println("tamaño: "+trosky.tamanio);
        System.out.println("raza: " + trosky.raza);


    }
}
