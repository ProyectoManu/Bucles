import java.util.Scanner;

/**
 * 7. Algoritmo que cuente cuántos múltiplos de 7 hay entre dos enteros dados por el 
usuario. 
 * @author Manuel López
 *
 */
    public class Ejercicio7  {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int cuenta=0;
		
		System.out.println("Introduce el número 1 ");
		int num1= entrada.nextInt();
		
		System.out.println("Introduce el número 2 ");
		int num2= entrada.nextInt();
		
		if (num1<num2 ) {
			for(int i=num1;i<=num2;i++) {
				if (i%7==0) {
					System.out.println(i);
					cuenta++;
				}
		

			}
			System.out.println("Hay "+cuenta+" multiplos de 7");
		}
	}
}
