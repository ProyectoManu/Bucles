import java.util.Scanner;
/**
 * 10. Algoritmo que escriba la tabla de multiplicar usando esquemas while. 
 * @author Manuel López
 *
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("tablas de multiplicar");
		
		int i=1;
		int j=1;
		while (i<=10) {
			j=1;
			while (j<11) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
				j++;
			}
			i++;
	
		}
		
	}

}
