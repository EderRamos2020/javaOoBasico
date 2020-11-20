package com.testAutomationCoach.aAbstraccion;

import com.testAutomationCoach.libs.Input;

public class Alarma {

    public int id;
    public int hora;
    public int minutos;
    public int segundos;
    public String mensaje;

    public void volumenAlarma(int hora, int minutos, int segundos)
    {
        this.hora = hora;
        this.minutos=minutos;
        this.segundos=segundos;

        this.id = this.hora + this.minutos + this.segundos;
        int volumen = this.id;
        System.out.println("clu"+volumen);
    }

    private void vibrar(int hora, int minutos, int segundos)
    {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;

        System.out.println("Brum Brum Brum");
    }

    public String sonar (int hora, int minutos, int segundos)
    {
        this.hora=hora;
        this.minutos=minutos;
        this.segundos=segundos;
        String Ring = " Ring Ring Ring";

        Input.print(Ring);
        return Ring;

    }


}
