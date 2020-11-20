package com.testAutomationCoach.Selenium;
import com.testAutomationCoach.libs.Input;

public class LoginPage {

    private Button continuar;
    private Label tituloP;
    private TextField fieldU;
    private TextField fieldP;
    private Image Logo;
    private boolean fieldEnter;
    private boolean validacionCorrectaLabel;
    private Link vinculoCond;

    public void digitardatos(String username, String password)
    {
        fieldU.ingresarText(username);
        fieldP.ingresarText(password);
        fieldEnter=true;
        Input.print("credenciales ingresadas");
    }

    public String borrarDatos()
    {
        fieldU.borrarText();
        fieldP.borrarText();
        fieldEnter=false;
        return "campos borradas";
    }

    public void validacionIngreso()
    {
        if(fieldEnter= true)
        {
            continuar.clicIzquierdo();
        }
        else
        {
            System.out.println("digite las credenciales primero");
        }
    }

    public Label validaciontitulo(String titulo)
    {
        Label valLabel=null;

        if(tituloP.equals(titulo))
        {
            valLabel=tituloP;
            validacionCorrectaLabel= true;
            System.out.println("validacion correcta de la pagina");
        }
        else
        {
            Input.print("No coincide el parametro con la pagina actual ");
        }

        return valLabel;
    }

    public void validacionLinkCondiciones()
    {
       vinculoCond.clicIzquierdo();
    }

}
