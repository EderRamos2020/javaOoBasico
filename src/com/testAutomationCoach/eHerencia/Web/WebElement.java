package com.testAutomationCoach.eHerencia.Web;
import com.testAutomationCoach.libs.Input;
import javax.swing.*;

public class WebElement {

    protected double pixelesX;
    protected double pixelesY;
    protected String forma;

    public WebElement()
    {
        forma="rectangular";
    }

    public void clic()
    {
        //JOptionPane.showMessageDialog(null, "clic");
        Input.print("clic WebElement");
        
    }

    public void clicDerecho()
    {
        //JOptionPane.showMessageDialog(null, "clic derecho");
        Input.print("clic derecho WebElement");
    }

    public void scroll()
    {
        System.out.println("drrrrrrrr");
    }

}
