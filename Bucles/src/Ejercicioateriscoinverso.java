import java.util.Scanner;

/**
 * Mostrar un tri�ngulo de asteriscos inversos con tantas l�neas
 * @author Manuel L�pez como quiera el usuario.
 *
 */
public class Ejercicioateriscoinverso {

	public static void main(String[] args) {
       Scanner otro = new Scanner(System.in);
		
		System.out.println("De cuantas filas quieres el tri�ngulo ");
		int fila = otro.nextInt();
		
		for (int i=1;i<=fila;i++) {
			for (int j=i; j<=fila; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
}}