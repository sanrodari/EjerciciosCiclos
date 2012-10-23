package co.edu.uniquindio.dowhile;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		int eu;
		do {
			eu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 7"));
			if(eu < 1 || eu > 10) {
				System.out.println("Número no válido.");
			}
		} while (eu != 7);
		
		System.out.println("El programa ha concluído exitosamente.");
	}

}
