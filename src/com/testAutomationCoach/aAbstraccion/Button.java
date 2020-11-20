package com.testAutomationCoach.aAbstraccion;

import com.testAutomationCoach.libs.Input;

public class Button {
    String label;
    String font;
    String color;
    String forma;
    double perimetro;

    String mensaje;

    public void setLabel(String myLabel)
    {
        this.label = "["+myLabel+"]";
        System.out.println(" boton "+this.label);
    }

    public void setColor(String externoColor, String label1)
    {
        this.label=label1;
        Button cuadro = new Button();
        cuadro.setLabel(label1);
        cuadro.mensaje=getColor(externoColor);
        Input.print("este boton "+"["+this.label+"] "+cuadro.mensaje);
    }

    public String getColor(String myColor)
    {
        this.color = myColor;
        String colorRetornado= "Colorealo con "+this.color;
        return colorRetornado;
    }

    public String getLabel()
    {

        return this.label;
    }

    public void onclick()
    {
        System.out.println("clic clic clic");
    }

    public void press()
    {
        System.out.println("sass sass sass");
    }

    public void release()
    {
        System.out.println("tra tra tra");
    }
}
