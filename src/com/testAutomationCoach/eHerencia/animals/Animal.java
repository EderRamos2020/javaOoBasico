package com.testAutomationCoach.eHerencia.animals;
import com.testAutomationCoach.eHerencia.Web.Image;
import com.testAutomationCoach.libs.Coordenadas;
import java.io.File;

public class Animal {

	private static int alo;
	public File picture;
	private char comida; //Carne o Vegetales o ambos
	private int nivelHambre; //1-100
	private String habitat; //selva, bosque, desierto, etc.
	private Coordenadas location;
	
	public void hacerRuido() {}
	public void comer() {}
	public void dormir() {}
	public void recorrerTerreno1() {}


	public static class Canino extends Animal
	{

		public Canino()
		{
			Animal garra = new Animal();
			garra.hacerRuido();
			garra.recorrerTerreno1();
			garra.picture=null;
			metodo();
			alo = 5;

		}

		public void recorrerTerreno2() {}
		public static int recorrerTerreno3() {return alo;}
	}


	public static class Felino extends Animal
	{

		public void recorrerTerreno3() {}
	}


	public static int metodo()
	{
		Animal.Canino pug = new Animal.Canino();
		pug.recorrerTerreno2();
		int a =  Animal.Canino.recorrerTerreno3();

		class ClaseEnMetodo
		{
			Animal.Canino boxer = new Animal.Canino();

		}
		return alo;
	}


}
