package com.testAutomationCoach.Selenium;
import com.testAutomationCoach.libs.Input;
import java.util.Scanner;

public class TextField {

    private double size;
    private String shape;
    private boolean colour;
    private String placeholder;
    private double pixelesX;
    private double pixelesY;
    private String text;

    public TextField()
    {
        size=5.5;
        placeholder="registro";
        pixelesX=0.5;
    }

    public TextField(String forma, boolean color, double pixelesY, String text)
    {
        this.shape= forma;
        this.colour= color;
        this.pixelesY=pixelesY;
        this.text = text;
    }

    public String ingresarText(String text)
    {
        String mensaje = "Texto ingresado"+text;
        Input.print(mensaje);
        return mensaje;
    }

    public void borrarText()
    {
        String texto= this.text;
        Input.print("Texto borrado "+texto);
    }

    public void selecccionOpcion()
    {
        Scanner sca = new Scanner(System.in);
        int opcion= sca.nextInt();
        Input.print("Opcion seleccionada "+opcion);
    }

    public String seleccionOpcion(String text)
    {
        Input.print("Opcion seleccionada "+text);
        return "Opcion seleccionada "+text;
    }
}
