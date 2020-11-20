package com.testAutomationCoach.aAbstraccion;

import com.testAutomationCoach.libs.Input;

public class EjemploPerro {
    public static void main(String[] args) {
        Perro fido = new Perro();
        fido.nombre = "Fido";
        fido.raza = "Gran Danes";
        fido.tamanio = 45.0;

        fido.ladrar();
        fido.correr();
        fido.comer();

        Input.print("Nombre " + fido.nombre + "\n");
        Input.print("Raza " +fido.raza + "\n");
        Input.print("Tamaño " + fido.tamanio + "\n");

    }
}
