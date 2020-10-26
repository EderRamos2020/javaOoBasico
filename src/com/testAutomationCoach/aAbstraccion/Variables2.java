package com.testAutomationCoach.aAbstraccion;

public class Variables2 {

        public static void main(String[] args) {

            Perro Danger = new Perro();
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

            double aumentoSalario = salario * 1.15;
            esAdulto = esMayorEdad(edad);
            inicial = "Omar".charAt(0);

            System.out.println("Edad: "+edad);
            System.out.println("Adulto: "+esAdulto);

        }

        public static boolean esMayorEdad(int edad)
        {
            return edad >= 18;
            //boolean a edad >= 18;
        }
}
