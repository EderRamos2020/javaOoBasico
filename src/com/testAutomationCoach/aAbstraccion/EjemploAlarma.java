package com.testAutomationCoach.aAbstraccion;

import com.testAutomationCoach.libs.Input;

public class EjemploAlarma {

    public static void main(String[] args) {

        Alarma mananera = new Alarma();


        mananera.id = 0;
        mananera.hora = 12;
        mananera.minutos = 35;
        mananera.segundos = 47;

        mananera.volumenAlarma(22,45,57);
        String valor=mananera.sonar(15, 15, 15);
        Input.print("id "+mananera.id+" hora "+mananera.hora+" minutos "+mananera.minutos+" segundos "+mananera.segundos);

        volumenAlarma(mananera, valor);
        Alarma regre = new Alarma();
        sonar( mananera.minutos, mananera.segundos, regre);



    }



    public static void volumenAlarma(Alarma generica, String texto)
    {
        String vari=generica.id+" ";
        String a = vari.replaceAll("4","A");
        String b = a.replaceAll("1", "i");
        b = b + texto;
        generica.mensaje = b;
        Input.print("mensaje "+generica.mensaje);
    }

    private static Alarma sonar( int minutos, int segundos, Alarma generic2)
    {
        generic2.segundos =minutos * 60;
        generic2.minutos = segundos/60;
        return generic2;

    }

}
