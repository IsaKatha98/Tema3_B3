package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
	
		//Declaramos las variables.
		
		int num; //Variable introducida por el usuario.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
													
		Scanner sc= new Scanner (System.in);
			
		/*Le pediremos al usuario que introduzca los datos y los guardaremos en la variable. Esto lo hacemos fuera por primera vez, para que no nos dé error
		 * en la inicialización de la variable.*/
		
		System.out.print("Introduzca las calificaciones y pulse Intro: ");
		num=sc.nextInt();
	
		//Instrucciones. Inicializamos la variable i en 1 y hacemos que el bucle pare en 4 con un incremento de uno por cada bucle.
		
		for (int i=1; i<=4; i++) {	
			
			//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
			
			System.out.print("Introduzca las calificaciones y pulse Intro: ");
			num=sc.nextInt();
		
		}
		
		//Una vez terminados los bucles, analizamos si alguno de los números es menor que 5, ya que en ese caso, hay suspensos.
		//En caso negativo, se imprimirá el mensaje correspondiente.
		
		if (num<5) {
			
			System.out.println("Hay suspensos.");
		
		} else {
			
			System.out.println("No ha habido suspensos.");
		}
		
		//Por último, cerramos el escáner.
		
		sc.close();

	}

}
