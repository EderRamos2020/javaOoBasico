package com.testAutomationCoach.dEncapsulacion;
import com.testAutomationCoach.libs.Input;

public class Maestro {

    private int codigo;
    private String[] estudios;
    private int edad;
    private String[] experiencia;
    private String especialidad;
    private int anosExp;

    public Maestro(int codigo, String[] estudios, String especialidad, String[] experiencia)
    {
        this.codigo=codigo;
        this.estudios=estudios;
        this.especialidad=especialidad;
        this.experiencia= experiencia;
    }

    public void tipoMaestro(int anosExp)
    {
        this.anosExp=anosExp;
        if(this.anosExp>0 && this.anosExp<5)
        {
            Input.print("profesor nivel joven");
        }
        else if(this.anosExp>4 && this.anosExp<10)
            {
            Input.print("profesor nivel maduro");
            }
            else if(this.anosExp>9 && this.anosExp<16)
                {
                Input.print("profesor nivel experimentado");
                }
                else
                {
                Input.print("profesor nivel legendario");
                }
    }

    public void setEstudios(String[] estudios)
    {
        this.estudios=estudios;
    }

    public void impEstudios()
    {
        for (String index : this.estudios)
        {
            System.out.println(index);
        }

    }

    public void setExperiencia(String[] experienciaLab)
    {
        this.experiencia = experienciaLab;
    }

    public void impExperiencia()
    {
        int i=1;
        for (String index: this.experiencia)
        {
          Input.print(" "+i+" "+index);
          i++;
        }
    }

}
