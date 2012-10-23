package co.edu.uniquindio.loopwhile;

import javax.swing.JOptionPane;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		int eu = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números" +
				"desea generar?"));
		
		if(eu == 1) {
			System.out.println("1");
		}
		else if(eu == 2) {
			System.out.println("1 1");
		}
		else if(eu > 2){
			String serie = "1 1 ";
			int i = 0;
			int preAnterior = 1;
			int anterior = 1;
			while (i < (eu - 2)) {
				int nuevo = preAnterior + anterior;
				preAnterior = anterior;
				anterior = nuevo;
				
				serie += nuevo + " ";
				
				i++;
			}
			
			System.out.println(serie);
		}
		else {
			System.out.println("La entrada no es válida.");
		}
	}

}
