import java.util.Scanner;

/**
 * Mostrar un triangulo de asteriscos con tantas l�neas como diga el usuario.
 * @author Manuel L�pez
 *
 */
public class Ejercicioasterisco {

	public static void main(String[] args) {
		Scanner otro = new Scanner(System.in);
		
		System.out.println("De cuantas filas quieres el tri�ngulo ");
		int fila = otro.nextInt();
		
		for (int i=1;i<=fila;i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		

	}

}
