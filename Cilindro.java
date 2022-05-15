package Practica6daw;

import java.util.Scanner;

public class Cilindro implements IFigurasGeometricas {
	Scanner teclado = new Scanner(System.in);
	float radio;
	float altura;

	public Cilindro() {
		System.out.println("Radio: ");
		this.radio = teclado.nextFloat();
		System.out.println("Altura: ");
		this.altura = teclado.nextFloat();
	}

	@Override
	public float calcularArea() {
		double resultado = 2 * Math.PI * this.radio * ( this.radio + this.altura );
		return (float) resultado;
	}

	@Override
	public float calcularVolumen() {

		double v = Math.PI*Math.pow(this.radio, 2)*this.altura;
		return (float) v;
	}

	@Override
	public void caracteristicas() {
		System.out.println("Calculadora de Yiyo. "+" Cilindro");
		
	}

}
