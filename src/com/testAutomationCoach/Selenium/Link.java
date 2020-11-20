package com.testAutomationCoach.Selenium;
import com.testAutomationCoach.libs.Input;

public class Link {

    private String colour;
    private double sizepx;
    private String[] font;
    private String url;
    private boolean enabled;

    public Link()
    {
        colour = "negro" ;
        sizepx=3.2;
        font= new String[] {"century","gothic"};
        url="";
    }

    public void clicIzquierdo(String url)
    {
        this.url=url;
        this.enabled=true;
        System.out.println("entrar al vinculo!!");
    }

    public boolean clicIzquierdo()
    {
        this.enabled=true;
        System.out.println("entrar al vinculo!!");
        return true;
    }

    public void clicDerecho()
    {
        this.colour="gris";
        this.enabled=false;
        Input.print("Volver a cargar!!");
    }

    public void movimientoLink(String url)
    {
        Input.print("*▓╬╬▓╬╬▓╬╬▓╬*");
        Input.print("╬▓╬"+url+"╬▓╬\n");
        Input.print("*▓╬╬▓╬╬▓╬╬▓╬*");
    }





}
