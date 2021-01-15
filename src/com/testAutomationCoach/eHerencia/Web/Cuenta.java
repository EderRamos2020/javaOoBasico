package com.testAutomationCoach.eHerencia.Web;
import com.testAutomationCoach.libs.Input;

public class Cuenta {

    private Persona titular;
    private double cantDinero;
    private String tipoCuenta;
    private static int cantCuentas;
    private int a;

    public Cuenta()
    {

        this.cantDinero=0;
        this.tipoCuenta="";
        cantCuentas++;
    }

    public Cuenta(Persona titular, String tipoCuenta)
    {
        this.titular=titular;
        this.tipoCuenta=tipoCuenta;
        cantCuentas++;
        this.a++;
    }

    public void setTitular(Persona titular)
    {
        this.titular=titular;
    }

    public Persona getTitular()
    {
        return titular;
    }

    public void setCantDinero(double cantDinero)
    {
       if(cantDinero>0)
       {
           this.cantDinero = this.cantDinero+cantDinero;
       }
    }

    public double getCantDinero()
    {
        return cantDinero;
    }

    public void setTipoCuenta(String tipoCuenta)
    {
        this.tipoCuenta=tipoCuenta;
    }

    public String getTipoCuenta()
    {
        return tipoCuenta;
    }

    public static int getCantCuentas()
    {
        return cantCuentas;
    }

    public String toString()
    {
        return "El titular "+this.titular+"\n tiene la cuenta "+this.tipoCuenta+"\n con saldo $"+this.cantDinero+",\n total cuentas "+cantCuentas;
    }

    public void retirarDinero(int cantDinero)
    {
        if(this.cantDinero>cantDinero)
        {
            this.cantDinero=this.cantDinero-cantDinero;
        }
        else
        {
            Input.print("fondos insuficientes $$ ");
        }
    }
}
