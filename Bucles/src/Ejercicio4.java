import java.util.Scanner;

/**
 * 4. Algoritmo que escriba los n�meros impares comprendidos entre dos enteros 
introducidos por el usuario. 
 * @author Manuel L�pez
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el n�mero 1 ");
		int num1= teclado.nextInt();
		
		System.out.println("Introduce el n�mero 2 ");
		int num2= teclado.nextInt();
		
		if (num1<num2 ) {
			for(int i=num1;i<=num2;i++) {
				if (i%2!=0) {
					System.out.println(i);
				}
			}
		} else {
			for(int i=num2;i<=num1;i++) {
				if (i%2!=0) {
					System.out.println(i);
				}
			}
		}
		
		

	}

}
