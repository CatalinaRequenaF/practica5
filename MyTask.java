package Practica6daw;

import java.util.Scanner;

public class MyTask {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Elige una opción.");
		System.out.println("1-Area cilindro.");
		System.out.println("2-Volumen cilindro.");
		System.out.println("3-Area cubo.");
		System.out.println("4-Volumen cubo.");
		System.out.println("5-Area tetraedro.");
		System.out.println("6-Volumen tetraedro.");
		System.out.println("7-Salir.");
		
		int opcion = teclado.nextInt();
		
		boolean salir = false;
		
		while(!salir) {
			switch(opcion) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				salir = true;
				break;
				
				
			}
		}
		
		
	}

}
