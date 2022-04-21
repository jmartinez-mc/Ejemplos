import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFicheroTextoApp {
	
	public static void main(String args[]) {
	    int car;
	    
		// Abro el fichero datos.txt
		// Para ello, creo un objeto de la clase
		// FileReader.
		
		// Puede lanzar FileNotFoundException
		// Obligatorio -> "Capturar" la excepción
		try {
			
			// Acciones que deseo hacer y que 
			// pueden lanzar excepción
		    FileReader fichero = 
			  	   new FileReader("datos.txt");
		    
		    // Leo el primer caracter
		    // (read puede lanzar IOException)
		    car = fichero.read();
		    // Leo el segundo caracter
		    car = fichero.read();
		    System.out.printf("Leido %c%n", car);
		    
		    fichero.close();		    
		    
		}catch(FileNotFoundException e) {
			// Acciones cuando se ha lanzado FileNotFoundException		
			System.out.printf("Fichero no encontrado");
		}catch (IOException e) {
			// Acciones cuando se ha lanzado IOException		
			System.out.printf("Error de E/S");
		}
		
		
		
		
	}

}
