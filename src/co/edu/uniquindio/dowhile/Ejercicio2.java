package co.edu.uniquindio.dowhile;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		int acumulador = 0;
		int contador = 0;
		do {
			acumulador += obtenerAleatorio();
			contador++;
		} while (acumulador < 100);
		
		System.out.println("El método se invocó " + contador + " veces y el " +
				"resultado final es " + acumulador);
	}
	
	public static int obtenerAleatorio() {
	  java.util.Random random = new java.util.Random();
	  return random.nextInt(10);
	}

}
