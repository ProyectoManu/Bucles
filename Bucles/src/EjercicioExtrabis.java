import java.util.Scanner;

/**
 * 6. Escribe que calcule la media de los 10 numeros pedidos por teclado. 
 * @author Manuel López
 *
 */
public class EjercicioExtrabis {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int suma=0;
		
		
		for (int i=1; i<=10; i++) {
			System.out.printf("Cuantos números queires? ",i);
				int num = entrada.nextInt();
			
			suma= suma + num;
					
	}
		float media = suma /10.0f;
		System.out.printf("La media es: %.2f",media);
	}
}
	
