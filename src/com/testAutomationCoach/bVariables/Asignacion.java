package com.testAutomationCoach.bVariables;


public class Asignacion {
    public static void main(String[] args) {

        DogArray Firu = new DogArray();
        //primitivas
        int edad;
        double salario;
        boolean esAdulto;
        char inicial;
//        long a= 789;
//        short b = 8;
//        byte c = 0;
//        byte h = 127;
//        boolean g=true;
//        boolean v=false;

        //inicializacion literal
        edad = 43;
        salario = 120000.00;

        //inicializacion por otra variable, expresion o metodo
        int nuevaEdad = 17;
        edad = nuevaEdad;
        aumentar(edad);

        double aumentoSalario = salario * 1.15;
        esAdulto = esMayorEdad(edad);
        inicial = "Omar".charAt(0);

        System.out.println("Edad: "+edad);
        System.out.println("Adulto: "+esAdulto);

    }

    public static int aumentar(int edade)
    {
        int edad = 0;
        int edada;
        edada=edade + 1;
        return edada;

    }
    public static boolean esMayorEdad(int edad)
    {
        return edad >= 18;
        //boolean a edad >= 18;
    }
}
