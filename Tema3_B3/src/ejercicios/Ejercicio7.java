package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
	
		//Declaramos las variables.
		
		int num; //Variable introducida por el usuario.
		int factorial=1; //Variable factorial.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
													
		Scanner sc= new Scanner (System.in);
													
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
						
		System.out.print("Introduzca un número y pulse Intro: ");
		num=sc.nextInt();
		
		//Instrucciones. 
		
		if (num>0) {
			
			for (int i=num; i>=1; i--) {	//Declaramos una variable i que solo existirá en el bucle. Se inicilizará en el num introducido por el usuario
											//y terminará en 0. Habrá un decremento de 1 por bucle.
			
				factorial=factorial*i;		//Multiplicamos el factorial por i.

				
			}

		} else {
			
			System.out.println("Número no válido.");
				
		}
	
		//Se imprime el resultado total.
		
		System.out.println("Total: "+factorial);
		
		//Por último, cerramos el escáner.
		
		sc.close();

	}

}
