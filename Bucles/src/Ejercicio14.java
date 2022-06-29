import java.util.Scanner;

/**
 * 14. Algoritmo que pida dos números naturales e imprimir su cociente entero por el 
método de las restas sucesivas. 
 * @author Manuel López
 *
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce dividendo: ");
		int dividendo = entrada.nextInt();
		
		System.out.println("Introduce divisor: ");
		int divisor = entrada.nextInt();
		
		int cociente;
		int resto;
		
		 if ( dividendo > 0 && divisor > 0 )
		    {
		        cociente = 0;
		        resto = dividendo;

		        while ( resto >= divisor )
		        {
		            resto -= divisor;
		            cociente++;
		        }
		        System.out.printf("\n   %d div %d = %d ( Resto = %d )", dividendo, divisor, cociente, resto);
		        		
		    } else
		       System.out.printf( "\n   ERROR: Ambos núcmeros deben ser mayores que cero.", 163 );

		   

		
		

	}

}
