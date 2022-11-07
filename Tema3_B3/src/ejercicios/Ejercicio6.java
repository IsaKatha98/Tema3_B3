package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {
	
	//Declaramos las variables.
		
		int suma=0;
		
	//Instrucciones. 
		
		for (int i=1; i<=20; i+=2) {	//Declaramos una variable i que solo existirá en el bucle. Se inicilizará en 1 y terminará 
										//en 20, y se sumará 2 por cada vuelta del bucle.
			suma +=i;
			
			System.out.println(i);		//Se imprime el resultado de cada bucle.
		
		}
		
		//Se imprime el resultado total.
		
		System.out.println("Total: "+suma);


	}

}
