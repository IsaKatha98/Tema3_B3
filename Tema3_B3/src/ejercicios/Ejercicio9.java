package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int num; //Variable introducida por el usuario.
		boolean esPrimo=true; //Variable factorial.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
													
		Scanner sc= new Scanner (System.in);
													
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
						
		System.out.print("Introduzca un número entero positivo y pulse Intro: ");
		num=sc.nextInt();
		
		//Instrucciones. 
		
		if (num>0) {
			
			if (num==1) {
				
				System.out.println("No es un número primo.");
			} else {
				
				for (int i=2; i<num; i++) {	
					
					if (num%i==0) {
						
						esPrimo=false;
						break;
						
					} 
				} 
				
				System.out.println(esPrimo?"Es primo.":"No es primo."); 
			}
				
		} else {
			
			System.out.println("Número no válido.");
				
		}
		
		//Por último, cerramos el escáner.
		
		sc.close();
	}

}
