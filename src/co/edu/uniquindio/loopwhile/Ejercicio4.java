package co.edu.uniquindio.loopwhile;

import javax.swing.JOptionPane;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		int eu = Integer.parseInt(JOptionPane.showInputDialog("¿A qué número " +
				"desea calcular la sumatoria cuadrada?"));
		
		int i = 0;
		long sumatoria = 0;
		while (i < eu) {
			sumatoria += (i + 1) * (i + 1);  
			
			i++;
		}
		
		System.out.println("El total de la sumatoria es: " + sumatoria);
	}

}
