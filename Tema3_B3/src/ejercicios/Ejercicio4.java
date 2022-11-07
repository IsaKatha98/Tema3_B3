package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int num; //Variable introducida por el usuario.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
													
		Scanner sc= new Scanner (System.in);
													
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
						
		System.out.print("Introduzca un número y pulse Intro: ");
		num=sc.nextInt();
		
		//Instrucciones. 
		
		for (int i=1; i<=num; i++) {	//Declaramos una variable i que solo existirá en el bucle. Se inicilizará en 3 y terminará 
										//en el número introducido por el usuario, haciendo un incremento de 3 por cada vuelta de 
			System.out.println(i);		//bucle. A conitnuación, se imprime.
		}
		
		//Por último, cerramos el escáner.
		
		sc.close();

	}

}