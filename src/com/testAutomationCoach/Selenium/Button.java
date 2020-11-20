package com.testAutomationCoach.Selenium;

import com.testAutomationCoach.libs.Input;

public class Button {

    private String color;
    private String texto;
    private double pixelesAncho;
    private double pixelesAlto;
    private boolean enabled;
    private boolean disabled;
    private String forma;

    public Button()
    {
        pixelesAncho=6.6;
        enabled=true;
    }

    public Button (double pixelesAlto, boolean disabled, String forma)
    {
        this.pixelesAlto=pixelesAlto;
        this.disabled=disabled;
        this.forma=forma;
    }

    public void clicIzquierdo()
    {
        enabled=false;
        System.out.println("enter ");
    }

    public boolean clicDerecho()
    {
        Input.print("Abrir vinculo \n");
        enabled=true;
        return true;
    }

    public int press()
    {
        int valor=0;
        this.disabled=false;
        return valor;
    }

    public int release()
    {
        int valor=1;
        this.disabled=true;
        return valor;
    }






}
