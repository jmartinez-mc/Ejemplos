import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class EscribirCadenaApp {

	/**
	 * Lee una cadena por teclado, y si no está
	 * vacía, la guarda (escribe) en un fichero.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		
		String texto = 
				JOptionPane.showInputDialog("Teclea texto");
		
		if (texto.isBlank()) {
			// No hay nada que escribir.
			return;
		}
		
		// Escribo el texto
		// Stream type: Character, Output (clase FileWriter)
		try {
			// 1. Crear objeto
			FileWriter fichero = new FileWriter("c:\\TEXTO-20-4-22.txt");
			
			// 2. Escribir
			//fichero.write(texto, 0, texto.length());
			fichero.write(texto);
			
			// 3. Cerrar
			fichero.close();
		
		}catch (IOException e) {
			System.out.println("ERROR E/S: "+ e);	
		}
	}

}
