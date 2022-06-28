import java.util.Scanner;

/**
 * 13. Algoritmo que pida un número natural y determine si es primo o no. 
 * @author Manuel López
 *
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		int num = entrada.nextInt();
		
		boolean primo=true;
		
		for(int i=2; i<num; i++) {
			if (num%i==0) {
				 primo=false;
			}
		}
	 
		if (primo==true) {
		System.out.println("El número es primo ");
	}

  else {
		System.out.println("El número no es primo ");
}
}}