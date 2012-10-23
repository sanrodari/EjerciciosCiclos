package co.edu.uniquindio.dowhile;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		System.out.println(calcularFactorial(0));
	}

	public static long calcularFactorial(int n) {
		if(n == 0) {
			return 1;
		}
		else {
			long resultado = 1;
			do {
				resultado *= n;
				n--;
			} while (n > 0);
			
			return resultado;
		}
	}

}
