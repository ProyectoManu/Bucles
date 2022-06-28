import java.util.Scanner;

/**
 * 9. Algoritmo que escriba la tabla de multiplicar del 1 al 10 usando esquemas for. 
 * @author Manuel López
 *
 */
public class Ejercicio9 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		System.out.println("tablas de multiplicar");
		
		for (int i=1;i<=10; i++) {
			for(int j=1;j<11;j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
		}

	}

}
