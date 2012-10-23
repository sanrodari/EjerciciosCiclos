package co.edu.uniquindio.loopwhile;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		boolean entradaValida = false;
		String eu = "";
		while (!entradaValida) {
			eu = JOptionPane.showInputDialog("Ingrese una de las siguientes " +
					"opciones:\n S, s, si, SI ó N, n, no, NO");
			
			entradaValida = eu.equalsIgnoreCase("s") || eu.equalsIgnoreCase("si") ||
					eu.equalsIgnoreCase("n") || eu.equalsIgnoreCase("no");
		}
		
		if(eu.equalsIgnoreCase("s") || eu.equalsIgnoreCase("si")) {
			System.out.println("La elección del usuario es " + true);
		}
		else {
			System.out.println("La elección del usuario es " + false);
		}
		
	}
	
}
