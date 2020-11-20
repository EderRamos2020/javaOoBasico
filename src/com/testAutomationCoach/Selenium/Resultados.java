package com.testAutomationCoach.Selenium;
import com.testAutomationCoach.libs.Input;

public class Resultados {

    private TextField articulo;
    private Button buscar;
    private Label resultadosP;
    private int paso;
    private boolean encontro;

    public void borrarInput()
    {
        this.paso=0;
        articulo.borrarText();
        Input.print("texto eliminado del input");
    }

    public void escribirArticulo()
    {
        this.paso=1;
        articulo.ingresarText("computador lenovo");
    }

    public boolean seleccionArticulo(String thinkpad)
    {
        this.paso=2;
        articulo.seleccionOpcion(thinkpad);
        encontro=true;
        return encontro;

    }

    public void clicBotonBuscar()
    {
        if(encontro)
        {
            buscar.clicIzquierdo();
            System.out.println("se dio clic para buscar!!");
        }
        else
        {
            Input.print("no existe el articulo");
        }
    }

    public void validacionPage(String resultados)
    {
        if (resultadosP.equals(resultados)) {
            Input.print("validacion pagina correcta");
        } else {
            Input.print("validacion pagina incorrecta");
        }
    }

}
