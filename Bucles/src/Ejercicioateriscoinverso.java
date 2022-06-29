import java.util.Scanner;

/**
 * Mostrar un triángulo de asteriscos inversos con tantas líneas
 * @author Manuel López como quiera el usuario.
 *
 */
public class Ejercicioateriscoinverso {

	public static void main(String[] args) {
       Scanner otro = new Scanner(System.in);
		
		System.out.println("De cuantas filas quieres el triángulo ");
		int fila = otro.nextInt();
		
		for (int i=1;i<=fila;i++) {
			for (int j=i; j<=fila; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
}}