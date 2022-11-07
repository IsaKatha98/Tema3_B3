package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		//Declaramos las variables.
		
		int num; //Variable introducida por el usuario.
		int suma=0; //Variable donde se sumarán los números introducidos.
		int contador=0; //Variable contador, necesaria para hacer la media.
		double media; //Variable media.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
													
		Scanner sc= new Scanner (System.in);
		
		//Instrucciones. 
		
		for (int i=1; i<=10; i++) {	//Declaramos una variable i que solo existirá en el bucle. Se inicilizará en 1 y terminará 
										//en 10, sumándose 1 por cada vuelta de bucle.
			
			//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
			
			System.out.print("Introduzca un número y pulse Intro: ");
			num=sc.nextInt();
			
			suma+=num;					//Se van sumando los números introducidos.
			contador++;					//Se incrementa en 1 por cada vuelta del bucle.
		}
		
		media= (double) suma/(double) contador;	//Hacemos la media fuera del bucle.
		
		System.out.println("La media de los números introducidos es: "+media);
		
		//Por último, cerramos el escáner.
		
		sc.close();

	}

}
