import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerLineaApp {

	public static void main(String[] args) {
        final String FILENAME = "datos.txt";
//////
        ////////
        // Sentencia try-with-resources
		try (
			// 1. Creo objeto BufferedReader ("abrir" fichero) 
			// stream-character-input (además creo un FileReader)
			BufferedReader fichero = 
					new BufferedReader(new FileReader(FILENAME));
			)
		{	
			// 2. Leo la primera linea
			String linea = fichero.readLine();
			if (linea!=null) {
				System.out.println("Primera linea: "+linea);
			}
			// 3. Cerrar -> No es necesario porque se realiza 
			// automaticamente al usar try-with-resources
		
		}catch (FileNotFoundException e) {
			System.out.printf("Error al abrir \"%s\"%n",FILENAME);
			
		}catch (IOException e) {
			System.out.println("ERROR E/S: "+ e);		
		}
	}
}
