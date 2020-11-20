package com.testAutomationCoach.dEncapsulacion;

public class Triangulo {
	
	//propiedades o campos
	//cuando esta instanciado el objeto memoria tambien es el constructor por defecto del sistema
	private int base;
	private int altura;

	//Constructor que recibe 2 parametros
	public Triangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	//metodos o comportamiento
	//Metodo que halla el area de un triangulo multiplicando la base * altura luego divide en 2 y este valor lo retorna
	public int sacarArea() {
		int area= (this.base*this.altura)/2;
		return area;
	}

	//Metodo que halla el perimetro de un triangulo, multiplicando la base por 3 y este valor lo retorna
	public int sacarPerimetro() {
		int perimetro= this.base*3;
	    return perimetro;	
	}

	//Metodo que al invocarlo retorna un int de la base del triangulo
	public int getBase() {
		return base;
	}

    //Metodo que recibe por parametro la base y se la asigna al atributo de la clase
	public void setBase(int base) {
		this.base = base;
	}

	//Metodo que retorna la altura del triangulo
	public int getAltura() {
		return altura;
	}

	//Metodo que recibe por parametro la altura del triangulo y se la asigna al atributo de la clase.
	public void setAltura(int altura) {
		this.altura = altura;
	}

	//Metodo que le asigna al objeto memoria un String y este lo retorna.
	public String toString() {
		return "Base es " + this.base + " Altura es "+ this.altura;
	}

}
