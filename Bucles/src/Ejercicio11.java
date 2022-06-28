import java.util.Scanner;
/**
 *11. Algoritmo que escriba la tabla de multiplicar usando esquemas do while. 
 * @author Manuel López
 *
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("tablas de multiplicar");
		
		int i=1;
		int j=1;
		do {
			j=1;
			do {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
				j++;
			} while (j<11);
			i++;
			System.out.println();
		}while (i<=10);
		
	}

}
