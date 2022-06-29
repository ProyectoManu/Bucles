import java.util.Scanner;

public class Ejerciciopiramide {

	public static void main(String[] args) {
	    Scanner otro = new Scanner(System.in);
		
			System.out.println("De cuantas filas quieres la pirámide ");
			int fila = otro.nextInt();
			
			for (int i=1;i<=fila;i++) {
				for (int j=1; j<=fila-i; j++) {
					System.out.print(" ");
				}
				for (int j=1; j<=i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
	}}

	
