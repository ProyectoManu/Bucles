import java.util.concurrent.TimeUnit;

/**
 * Programa que muestre un reloj durante 24 horas en formato 00:00:00
 * @author Manuel López
 *
 */
public class Ejercicioreloj {
	public static void main(String[] args) throws InterruptedException {

 		String borrar="\b\b\b\b\b\b\b\b";
 		
		for (int horas=0; horas<24; horas++) {
			for (int minutos=0; minutos<59; minutos++) {
				for(int segundos=0; segundos<59; segundos++) {
					System.out.printf("%02d;%02d;%02d", horas,minutos,segundos);
					TimeUnit.MILLISECONDS.sleep(1000);
					System.out.print(borrar);
				}
			}

	}
}}
