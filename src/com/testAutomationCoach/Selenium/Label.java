package com.testAutomationCoach.Selenium;
import com.testAutomationCoach.libs.Input;

public class Label {

    private String text;
    private String font;
    private double size;
    private String colour;

    public Label(String text, String font, double size, String colour)
    {
        this.text=text;
        this.font=font;
        this.size=size;
        this.colour=colour;
    }

    public void cambiaColor(String colour, String text)
    {
        this.colour=colour;
        this.text=text;
        System.out.println(" "+colour+" "+text+" \n");
    }

    public boolean cambiaTamano(double size, String text)
    {
        this.size=size;
        this.text=text;
        return true;
    }

    public void movimientoLetras(String text)
    {
        Input.print("*▓╬╬▓╬╬▓╬╬▓╬*");
        Input.print("╬▓╬"+text+"╬▓╬\n");
        Input.print("*▓╬╬▓╬╬▓╬╬▓╬*");
    }
}
