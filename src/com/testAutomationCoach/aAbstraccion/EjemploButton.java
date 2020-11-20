package com.testAutomationCoach.aAbstraccion;

public class EjemploButton {

    public static void main(String[] args) {

        Button cua = new Button();
        Button redo = new Button();

        String label = "Entrar";
        cua.color= "azul";
        cua.forma= "indefinida";


        redo.font="Century";
        redo.forma="elipse";

        redo.setColor("fucsia", label);
        redo.getColor("rosado");

        String a=redo.getLabel();
        redo.perimetro = perimetroRectCua(cua,5,5);


    }

    private static double perimetroRectCua(Button objeto, double ladoLargo, double ladoCorto)
    {

        if(ladoLargo == ladoCorto)
        {
            objeto.forma="cuadrado";
            objeto.perimetro=(ladoLargo*2) + (ladoCorto*2);
        }
        else
        {
            objeto.forma="rectangulo";
            objeto.perimetro=(ladoLargo*2) + (ladoCorto*2);
        }
        return objeto.perimetro;
    }
}
