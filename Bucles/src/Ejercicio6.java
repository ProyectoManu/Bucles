import java.util.Scanner;

/**
 * 6. Algoritmo que calcule el factorial de un número entero introducido por el usuario. 
 * @author Manuel López
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
			
			int factorial =1;
			
			
			System.out.println("Introduce un número: ");
			int num = entrada.nextInt();
			
				
		for(int i=1;i<=num;i++) {
			
			factorial=factorial*i;
		}
				
		System.out.println("El factorial es: "+factorial);
	
	}		


}