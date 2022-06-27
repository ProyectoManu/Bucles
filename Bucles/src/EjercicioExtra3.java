import java.util.Scanner;

/**
 * Programa que pida un número del 1 al 10 hasta que el usuario acierte
 * ell número definido en el progrma.
 * @author Manuel López
 *
 */
public class EjercicioExtra3 {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		      final int acierto=3;
		      
		      int num;
		      
		      do {
		    	  System.out.println("Acierta el número (del 1 al 10):");
		    	  num = teclado.nextInt();
		    	  
		    	  if (num==acierto) {
		    		  System.out.println("Enhorabuena! Has acertado");
		    	  } else {
		    		  System.out.println("Has fallado. Vuelve a intentarlo.");
		    	  }
		      }while(num!=acierto);
	}

}
