package fp.daw.examen;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {

	/* 
	 * 2 puntos
	 * 
	 * Define, después de este comentario, un método llamado 'busquedaBinaria' que declare dos
	 * parámetros formales: un vector de números enteros sin valores repetidos y un número entero.
	 * El método deberá encontrar y retornar mediante una búsqueda binaria sobre el vector el 
	 * índice de la posición en la que se encuentra almacenado el número dentro del
	 * vector, o el valor -1 si dicho dicho número no se encuentra almacenado en el vector. 
	 *  
	 */
	
	
	
	/*
	 * 1 punto
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba el método
	 * 'busquedaBinaria'. En primer lugar tendrá que crear un vector de números enteros
	 * de un tamaño aleatorio entre 100 y 200. A continuación almacenará números aleatorios
	 * comprendios entre Integer.MIN_VALUE e Integer.MAX_VALUE - 1, sin que se repita
	 * ningún valor. Finalmente generará números aleatorios en el mismo intervalo y 
	 * comprobará invocando al método 'busquedaBinaria' si se encuentran almacenados en
	 * el vector. Este proceso finalizará la primera vez que la búsqueda resulte positiva, es
	 * decir, la primera vez que el método retorne un valor distinto de -1, mostrando por
	 * pantalla el índice retornado.
	 * 
	 */
	
	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(101) + 100;
		int [] v = new int [n];
		long limite = (long)Integer.MAX_VALUE - (long)Integer.MIN_VALUE;
		long valor;
		int indice;
		for (int i=0; i<v.length; i++) {
			valor = r.nextLong() % limite + Integer.MIN_VALUE;
			v[i] = (int) valor;
		}
		Arrays.sort(v);
		do {
			valor = r.nextLong() % limite + Integer.MIN_VALUE;
			indice = Arrays.binarySearch(v, (int) valor);
		}while( indice < 0);
		System.out.println("El valor " + valor + " se encuentra en ");
		System.out.println("la posicion " + indice);
	}

}
