import java.util.Scanner;

/**
 * 6. Escribe que calcule la media de los  numeros pedidos por teclado. 
 * @author Manuel L�pez
 *
 */
public class EjercicioExtra1 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		int suma=0;
		int numeros=0;
		int opcion=0;
		
		
		do {
			System.out.printf("Introduce el n�mero %d: ",numeros);
			int num = entrada.nextInt();
			
			
			suma= suma + num;
			numeros++;
			
			System.out.printf("�quieres m�s n�meros (1=si, 0=no)?: ");
			opcion = entrada.nextInt();
					
	} while(opcion==1);
		float media = (float) suma / numeros;
		System.out.printf("La media es: %.2f",media);
	}
}
	
