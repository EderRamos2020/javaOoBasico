package com.testAutomationCoach.dEncapsulacion;

import com.testAutomationCoach.libs.Input;

public class EjemploDelTriangulo {

	public static void main(String[] args) {
		Triangulo t = new Triangulo(5,3);
		
		System.out.println("El area es " + t.sacarArea());
		System.out.println("El perimetro es " + t.sacarPerimetro());
		System.out.println(t);
		
		Input.print(Double.MAX_VALUE + "\n");
		Input.print(Float.MAX_VALUE);

		Alarma lol = new Alarma();
		int hora=lol.sonarAlarma();

		String[] estudios = new String[] {"licenciado", "diplomado", "especializacion"};
		String[] experiencia= new String[] {"prof reemplazo", "prof catedra", "coordinador"};
		Maestro perez = new Maestro(555, estudios, "derecho penal", experiencia);

		perez.impExperiencia();
		perez.tipoMaestro(18);

	}
}
