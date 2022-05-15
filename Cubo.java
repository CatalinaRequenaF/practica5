package Practica6daw;

import java.util.Scanner;

public class Cubo implements IFigurasGeometricas {
	Scanner teclado = new Scanner(System.in);
	
	@Override
	public float calcularArea() {
		System.out.println("Aristas: ");
		double aristas = teclado.nextDouble();
		
		double a = 6*Math.pow(aristas, 2);
		return (float) a;
	}

	@Override
	public float calcularVolumen() {
		System.out.println("Aristas: ");
		double aristas = teclado.nextDouble();
		
		double v = Math.pow(aristas, 3);
		return (float) v;
	}

	@Override
	public void caracteristicas() {
		System.out.println("Calculadora de Yiyo. "+" Cubo");
		
	}

}
