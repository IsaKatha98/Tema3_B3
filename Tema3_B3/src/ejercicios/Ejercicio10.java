package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int numA; //Variable introducida por el usuario.
		int numB; //Segunda variable introducida por el usuario.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
													
		Scanner sc= new Scanner (System.in);											
		
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
		
		System.out.print("Introduzca un número A y pulse Intro: ");
		numA=sc.nextInt();
		
		System.out.print("Introduzca un número B (debe ser mayor que A) y pulse Intro: ");
		numB=sc.nextInt();
		
		//Instrucciones. Primero, establecemos una condición en la que debe ocurrir que A sea menor que B, sino salta mensaje de error.
		
		if (numA<numB) {	
			
			//Establecemos que i sea el número A y se repita el bucle hasta que llegue al número B con un incremento de 1 por bucle.
			
			for (int i=numA; i<=numB; i++) {
				
				System.out.println(i);
			}
		
		} else {
			
			System.out.println("ERROR. El número B debe ser mayor que A.");
		}
		
		//Por último, cerramos el escáner.
		
		sc.close();

	}

}
