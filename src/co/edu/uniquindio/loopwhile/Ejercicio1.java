package co.edu.uniquindio.loopwhile;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		boolean esMayorCien = false;
		int eu = 0;
		while (!esMayorCien) {
			eu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número mayor que cien"));
			esMayorCien = eu > 100; 
		}
		
		System.out.println("El número que rompió el ciclo es " + eu);
	}

}
