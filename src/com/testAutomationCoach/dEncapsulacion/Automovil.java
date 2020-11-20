package com.testAutomationCoach.dEncapsulacion;

import com.testAutomationCoach.libs.Input;

public class Automovil {
	//Atributos
	

	private String marca;
	private double velocidadActual;
	private double maximaVelocidad;
	private String tipoDeTransmision;
	private int numDePuertas;
	private int numDeLlantas;
	private int litrosGasolina;
	private double temperatura;
	private boolean apagado=true;
	private double revolucionesMinuto;

	//Constructor con valores por default que toma el objeto
	Automovil() {
		marca = "Ford";
		velocidadActual = 0.0;
		maximaVelocidad = 200.0;
		tipoDeTransmision = "Manual";
		numDePuertas = 2;
		numDeLlantas = 4;
		revolucionesMinuto=1;
	}

	//Constructor que recibe parametros para inicializar los artributos
	Automovil(String marca, double maximaVel, String tipoTransmision, int numPuertas, int numLlantas) {
		//this();
		this.marca = marca;
		this.velocidadActual = 0.0;
		this.maximaVelocidad = maximaVel;
		this.tipoDeTransmision = tipoTransmision;
		this.numDePuertas = numPuertas;
		this.numDeLlantas = numLlantas;
	}
	//comportamiento

	//Metodo en el que se inicializa los atributos
	public void encenderAuto()
	{
		apagado=false;
		litrosGasolina=30;
		temperatura=40;
		System.out.println("fun fun fun");
	}

	//Metodo que verifica si la temperatura es menor de 50 y no esta apagado incrementa la velocidad y revoluciones
	public void acelerar()
	{
		if(temperatura <= 50)
		{
			if (apagado != true)
			{
				Input.print("run run\n");
				this.velocidadActual += 5.0;
				this.revolucionesMinuto += 2;
			}
			else
				{
				System.out.println("Encienda el vehiculo porque esta apagado");
			}
		}
		else
		{
			System.out.println("Espere 15 que se refrigere, si no mantenimiento ");
		}
	}

	//Metodo que baja la velocidad a 0
	public void frenar() {

		Input.print("Screeeeech!\n");
		this.velocidadActual = 0;
	}

	//Metodo que verifica si no esta apagado y la vel = 0 reduce la vel en -5
	public void retroceder() {
		if(!apagado)
		{
			if (this.velocidadActual == 0)
			{
				Input.print("bi bi bi bi\n");
				this.velocidadActual -= -5;
			}
		}
		else
		{
			System.out.println("Esta apagado, enciendalo y la velociadad este en 0");
		}
	}

	//Funcion que retorna el valor del atributo velocidadActual
	public double getVelocidad() {
		return velocidadActual;
		
	}

	//Metodo que cambia el valor del atributo apagado
	public void apagarAuto()
	{
		apagado = true;
		System.out.println("chuuuuuu");
	}

	//Funcion que retorna el valor del atributo litrosGasolina
	public double getLitrosGasolina()
	{
		System.out.println("Litros gasolina " + litrosGasolina );
		return litrosGasolina;

	}

	//Funcion que retorna el valor del atributo temperatura
	public double getTemperatura()
	{
		System.out.println("Temperatura "+temperatura);
		return temperatura;
	}

	//Funcion que retorna el valor del atributo revolucionesMinuto
	public double getRevolucionesMinuto()
	{
		System.out.println("Revoluciones por minuto del giro de eje del motor");
		return revolucionesMinuto;
	}
}
