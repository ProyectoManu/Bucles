import java.util.Scanner;
/**
 * 3. Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
comprendido entre uno y diez, introducido por el usuario, usando un esquema do 
while. Nota: En los tres ejercicios anteriores, el programa ha de controlar mediante 
un esquema do-while, que el número está comprendido entre 1 y 10. 
 * @param args
 */
public class Ejercicio3 {

	public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
			
	        int num=0;
			System.out.println("tablas de multiplicar");
			do {
				System.out.println("Introduce un número del 1 al 10");
			    num= teclado.nextInt();
			}while (num<1 || num>10);
			
			int i=1;
			do {
				System.out.printf("%d x %d = %d\n", num, i, num*i);
				i++;
			} while ( i <= 10);
			
			}
	}

