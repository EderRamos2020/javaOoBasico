package com.testAutomationCoach.eHerencia.Web;
import com.testAutomationCoach.libs.Input;

import javax.swing.*;

public class Button extends Container{

    public boolean enabled;
    public String color;
    public String text;

    public Button()
    {
        name = "";
        posicion = "";
        color="white";
    }

    public void setText(String text)
    {
        this.text=text;
    }

    public void setColor(String color)
    {
        this.color=color;

    }



}
