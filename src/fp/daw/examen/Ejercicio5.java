package fp.daw.examen;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2 puntos
	 * 
	 * Crea en el método 'main' un juego que consista en generar de forma aleatoria
	 * un número entero comprendido entre 100 y 200 y pedirle al usuario que lo
	 * adivine. Para ello el programa le pedirá que introduzca por teclado un número.
	 * Si introduce el número correcto se mostrará un mensaje por pantalla indicando
	 * que ha acertado acompañado del número de intentos realizados y del tiempo
	 * empleado. A continuación, se le dará al usuario la opción de volver a jugar o
	 * de finalizar el juego.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner teclado = new Scanner(System.in);
		
		int aleatorio = r.nextInt(101)+100;
		int numero = 0;
		
		while (numero != aleatorio) {
			System.out.println("Introduce el número a adivinar:");
			numero = teclado.nextInt();
			if (numero == aleatorio) {
				System.out.println("Acertaste el número");
			}
		}	
		teclado.close();
	}

}
