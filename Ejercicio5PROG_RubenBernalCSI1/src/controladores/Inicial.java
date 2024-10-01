/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase principal de la aplicación
 * @author rbr - 011024
 *
 */
public class Inicial {

	/**
	 * Método principal de la aplicación
	 * rbr - 011024
	 * @param args
	 */
	public static void main(String[] args) {


		//Variables
		int numero;
		boolean esPar;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicito al usuario por consola el número entero a comprobar
		System.out.println("Introduzca el número que desee: ");
		numero = sc.nextInt();
		
		//Compruebo si es número es par o impar
		if(numero%2==0) {
			esPar = true;
			System.out.println("El número " + numero + " es par");
		}else {
			esPar = false;
			System.out.println("El número " + numero + " es impar");
		}

	}

}
