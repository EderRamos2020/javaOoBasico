package com.testAutomationCoach.eHerencia.Web;
import com.testAutomationCoach.libs.Input;

public class Container extends WebElement{

    protected String name;
    protected String posicion;
    protected String[] elements;
    protected String[] type;
    protected int cant;

    public Container()
    {
        cant=0;
    }

    public void setElements(int canti, String[] tipo, String[] text)
    {
        this.cant = canti;
        elements = new String[cant];
        elements = text;
        type = new String[cant];
        type=tipo;
        System.out.println("Elementos ingresados");
    }

    public String[] getElements()
    {

       for(String x: elements)
        {
            System.out.println(x);
        }

        return elements;
    }

    public void clic()
    {
        //JOptionPane.showMessageDialog(null, "clic derecho");
        Input.print("clic container");
    }

}
