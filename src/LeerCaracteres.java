import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LeerCaracteres {
	/**
	 * Leer N caracteres de un fichero de texto que exista.
	 * N se leerá por teclado.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args)  {
		String strNumCars = 
				JOptionPane.showInputDialog("¿Cuantos?");
		int numCars = Integer.parseInt(strNumCars);
		
		if (numCars <= 0) {
			// No hay nada que leer.
			return;
		}
				
		// Leer caracteres
		// Stream type: Character, Input (clase FileReader)
		int car;
		FileReader fichero;
		try {
			// 1. Crear objeto
			fichero = new FileReader("src/LeerCaracteres.java");
			
			// 2. Escribir
			//fichero.write(texto, 0, texto.length());
			
			int cantidad = 0;
			// Leo la primera vez (podría estar vacío)
			car = fichero.read();
			// Mientras no sea EOF y no haya leido los 
			// caracteres pedidos.
			while (car != -1 && cantidad<numCars) {
				cantidad++;
				
				System.out.print(Character.toUpperCase((char)car));
				// Leo el siguiente caracter
				car = fichero.read();				
			}
			
			// 3. Cerrar
			fichero.close();
		
		}catch (IOException e) {
			System.out.println("ERROR E/S: "+ e);		
		}

	}

}
