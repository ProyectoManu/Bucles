import java.util.Scanner;

/**
 * 1. Algoritmo que imprima la tabla de multiplicar correspondiente a un n�mero 
comprendido entre uno y diez, introducido por el usuario, usando un esquema for.
 * @author Manuel L�pez
 *
 */
public class Ejercicio1bis {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("tablas de multiplicar");
		System.out.println("Introduce un n�mero del 1 al 10");
		int num= teclado.nextInt();
		
		for (int i=1;i<=10; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
		
	}

}