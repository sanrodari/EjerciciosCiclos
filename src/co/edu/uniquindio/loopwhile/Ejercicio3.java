package co.edu.uniquindio.loopwhile;

import javax.swing.JOptionPane;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		int i = 0;
		int eu = Integer.parseInt(JOptionPane.showInputDialog("Cuantos número " +
				"de la serie desea imprimir"));
		
		while (i < eu) {
			String numeroActual = (i + 1) % 3 == 0 ? "1" : "0";
			System.out.print(numeroActual);
			
			i++;
		}
	}

}
