package co.edu.uniquindio.dowhile;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		Archivo archivo = new Archivo();
		
		String contenido = "";
		int contadorPalabraAleatorio = 0;
		String linea;
		do {
			linea = archivo.obtenerSiguienteLinea();
			if(linea != null) {
				contenido += (linea + '\n');
				
				if(linea.contains("aleatorio")) {
					contadorPalabraAleatorio++;
				}
			}
		} while (linea != null);
		
		System.out.println("El número de líneas que tiene la palabra 'aleatorio' es: " + contadorPalabraAleatorio);
		System.out.println("El contenido es:\n" + contenido);
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
