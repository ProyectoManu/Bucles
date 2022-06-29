import java.util.Scanner;

/**
 * Mostrar un triangulo de asteriscos con tantas líneas como diga el usuario.
 * @author Manuel López
 *
 */
public class Ejercicioasterisco {

	public static void main(String[] args) {
		Scanner otro = new Scanner(System.in);
		
		System.out.println("De cuantas filas quieres el triángulo ");
		int fila = otro.nextInt();
		
		for (int i=1;i<=fila;i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		

	}

}
