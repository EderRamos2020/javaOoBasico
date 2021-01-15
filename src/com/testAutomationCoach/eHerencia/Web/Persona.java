package com.testAutomationCoach.eHerencia.Web;

public class Persona {

    public static int contadorObjetos;
    private static int incrementoEdad;
    private String name;
    private int age;
    private String dni;

    public Persona()
    {
        this.name="";
        this.age=0;
        this.dni="";
        contadorObjetos++;
    }

    public Persona(String name, int age, String dni)
    {
        this.name=name;
        this.age=age;
        this.dni=dni;
        contadorObjetos++;
    }

    public void setName(String name1)
    {
        this.name=name1;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age=age;
        incrementoEdad=this.age+1;
    }

    public int getAge()
    {
        return age;
    }

    public void setDni(String dni)
    {
        this.dni=dni;
    }

    public String getDni()
    {
        return dni;
    }

    public String getObjetos(String texto)
    {
        return texto+contadorObjetos;
    }

    public String toString()
    {
        return "Nombre es "+this.name+" edad es "+this.age+" identificacion es "+this.dni;
    }

    public static int getIncrementoAge()
    {
        return incrementoEdad;
    }

}
