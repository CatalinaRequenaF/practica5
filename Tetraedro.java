package Practica6daw;

import java.util.Scanner;

public class Tetraedro implements IFigurasGeometricas {
	Scanner teclado = new Scanner(System.in);
	@Override
	public float calcularArea() {
		System.out.println("lado : ");
		double lado = teclado.nextDouble();
		
		double A = Math.sqrt(3)*Math.pow(lado, 2);
		
		return (float) A;
	}

	@Override
	public float calcularVolumen() {
		System.out.println("Arista:");
		double arista = teclado.nextDouble();
		
		double v = Math.sqrt(2)/12*Math.pow(arista, 2);
		
		return (float) v;
	}

	@Override
	public void caracteristicas() {
		System.out.println("Calculadora de Yiyo. "+" Tetraedro.");
		
	}

}
