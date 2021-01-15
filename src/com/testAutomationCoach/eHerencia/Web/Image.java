package com.testAutomationCoach.eHerencia.Web;

import com.testAutomationCoach.libs.Input;

import javax.swing.*;

public class Image extends Container  {


    protected String nameImagen;
    protected String alt;
    protected int num=0;
    protected String carpetaBase;
    protected String repoAdic;

    public Image( String nombre, String posicion)
    {
        this.name = "";
        this.posicion = "";
        this.carpetaBase="";
    }

    protected void secuencia()
    {
        num=num+2;
    }

    public String getUbicacionImagen(String nameImagen)
    {
        String ubicacion="C://Images/"+num+"/"+carpetaBase+"/"+nameImagen;
        return ubicacion;
    }

    public void agregarRepositorio(String carpeta)
    {
        this.carpetaBase=carpeta;
        this.repoAdic = "C://Images/"+num+"/"+carpeta;
    }

    public void scroll()
    {
        System.out.println("drrrrrrrr Image");
    }
}
