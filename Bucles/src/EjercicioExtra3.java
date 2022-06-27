import java.util.Scanner;

/**
 * Programa que pida un n�mero del 1 al 10 hasta que el usuario acierte
 * ell n�mero definido en el progrma.
 * @author Manuel L�pez
 *
 */
public class EjercicioExtra3 {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		      final int acierto=3;
		      
		      int num;
		      
		      do {
		    	  System.out.println("Acierta el n�mero (del 1 al 10):");
		    	  num = teclado.nextInt();
		    	  
		    	  if (num==acierto) {
		    		  System.out.println("Enhorabuena! Has acertado");
		    	  } else {
		    		  System.out.println("Has fallado. Vuelve a intentarlo.");
		    	  }
		      }while(num!=acierto);
	}

}
