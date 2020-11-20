package com.testAutomationCoach.dEncapsulacion;

import java.util.Random;

public class Alarma {

    private int id;
    private String nombre;
    private int hora;
    private int min;
    private int seg;
    private int tiempoSonando;
    private int numeroVeces;

    public Alarma() {

        this.nombre = "por la mañana";
        this.hora = 13;
        this.min = 45;
        this.seg = 35;
        this.tiempoSonando=3;
        this.numeroVeces=2;
    }

    public Alarma(String nombreA, int horaA, int minA, int segA, int tiempoSonandoA, int numeroVeces)
    {

        this.nombre= nombreA;
        this.hora=horaA;
        this.min=minA;
        this.seg=segA;
        this.tiempoSonando=tiempoSonandoA;
        this.numeroVeces=numeroVeces;
    }

    public int sonarAlarma()
    {
        String horaf=this.hora+"00";
        System.out.println("Alarma!! Ring Ring Ring hora: "+horaf+"\n");
        return this.hora;

    }

    public int[] vibrarAlarma()
    {
        String horaf = this.hora+"00";
        int minF = this.min;
        System.out.println("Alarma!! broum broum broum");
        System.out.println("hora: "+horaf+" min: "+minF);
        int horaM = Integer.parseInt(horaf);
        int[] ala = {horaM,minF};
        int[] pru = new int[2];
        return ala;

    }

    public void crearAlarma()
    {
        double num=Math.random()*8+1;
        String alar= "hora:"+this.hora+"min:"+this.min+"seg:"+this.seg;
        //int[] ala = {this.hora, this.min, this.seg};
        System.out.println("Alarma creada"+alar);
        System.out.println("Alarma "+this.id+" "+num);


    }

    public void eliminarAlarma()
    {
        Random num = new Random();
        int numRes= num.nextInt(99998)+1;
        System.out.println("alarma eliminada!!"+this.nombre+" # "+numRes);
        System.out.println("tiempo sonando "+this.tiempoSonando);
        System.out.println("numero de veces "+this.numeroVeces);
    }

}
