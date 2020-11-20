package com.testAutomationCoach.Selenium;
import com.testAutomationCoach.libs.Input;

public class Image {

    private double largoPix;
    private double altoPix;
    private String shape;
    private boolean enabledLink;

    public Image()
    {
        shape="rectangular";
        boolean stateAni= false;
    }

    public Image(double largoPix, double altoPix)
    {
        this.largoPix=largoPix;
        this.altoPix=altoPix;
    }

    public void animation()
    {
        boolean stateAni = true;
        Input.print("¨¨¨*¨¨¨*¨¨¨*¨¨¨¨*¨¨¨");
        Input.print("¨¨¨*¨¨¨*¨¨¨*¨¨¨¨*¨¨¨");
        Input.print("¨¨¨*¨¨¨*¨¨¨*¨¨¨¨*¨¨¨");
    }

    public String direccionarPage(String page)
    {
        this.enabledLink=true;
        String pagefi="c:index/"+page;
        return pagefi;
    }

}
