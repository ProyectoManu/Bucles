import java.util.Scanner;

/**
 * 5. Algoritmo que sume los n primeros números enteros, siendo n un número 
introducido por el usuario. 
 * @author Manuel López
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
			
			int suma =0;
			
			for (int i=1; i<=num; i++) {
				suma= suma+i;
				
			}
			System.out.println("La suma de los n primeros es "+suma);
	}

}
