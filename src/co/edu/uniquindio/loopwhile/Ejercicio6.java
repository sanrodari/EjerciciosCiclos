package co.edu.uniquindio.loopwhile;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		Archivo archivo = new Archivo();
		String linea;

		int i = 0;
		int enQueLinea = -1;
		while((linea = archivo.obtenerSiguienteLinea()) != null) {
			System.out.println(linea);
			if(linea.contains("aleatorio") && enQueLinea == -1) {
				enQueLinea = i + 1;
			}
			i++;
		}
		
		if(enQueLinea != -1) {
			System.out.println("La primera línea que tiene la palabra " +
					"'aleatorio' es " + enQueLinea);
		}
		else {
			System.out.println("No se encontró la línea");
		}
	}
	
	public static class Archivo {
		
		private java.util.Random random = new java.util.Random();
		private int lineaActual = 0;
		private int numeroLineas;
		private String[] lineas;
		private final String[] PALABRAS_CANDIDATAS = new String[]{
			"Lo", "de", "para", "carro", "programa", "vehículo", "computador",
			"algoritmo", "aleatorio", "determinístico", "línea"
		};
		
		public Archivo() {
			numeroLineas = random.nextInt(10) + 1;
			
			lineas = new String[numeroLineas];
			
			for (int i = 0; i < lineas.length; i++) {
				lineas[i] = generarLinea();
			}
		}
		
		public String obtenerSiguienteLinea() {
			if(lineaActual == numeroLineas) {
				return null;
			}
			else {
				String retorno = lineas[lineaActual];
				lineaActual++;
				return retorno;
			}
		}
		
		private String generarLinea() {
			String linea = "";
			for (int i = 0; i < 5; i++) {
				int indiceAleatorio = random.nextInt(PALABRAS_CANDIDATAS.length);
				String palabra = PALABRAS_CANDIDATAS[indiceAleatorio];
				linea += (palabra + " ");
			}
			
			return linea;
		}
	}

}
