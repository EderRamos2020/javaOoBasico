package com.testAutomationCoach.aAbstraccion;

public class Button {
    String label;
    String font;
    String color;
    String forma;
    double ancho;
    double alto;
    String mensaje;

    public void setColor(String externoColor)
    {
        Button cuadro = new Button();
        cuadro.mensaje=getColor(externoColor);
        libs.Input.print("color del boton "+cuadro.mensaje);
    }

    public void setLabel(String myLabel)
    {
        System.out.println("descripcion del boton "+myLabel);
    }

    public String getColor(String myColor)
    {
        this.color = myColor;
        String colorRetornado= "Colorea con "+this.color;
        return colorRetornado;
    }

    public String getLabel(String myLabel)
    {
        return null;
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
