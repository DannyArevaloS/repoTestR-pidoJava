package nuevo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;
import java.io.BufferedWriter;

public class parImpar {
	
public static void main(String[] args) throws IOException{
        
        
        //ficheroNum();
		//System.out.println("Segundo ejecicio --------->");
		//ficheroTxt();
	
    }
	
	public static void ficheroNum() throws IOException {
		
		PrintWriter out = null;
		String nomFich;
		int i = 0;
		try {
			out = new PrintWriter(new FileWriter("numeros.txt"));
			
			for(i=0 ; i<10 ;i++) {
				out.println(i);
			}
			
			
		} finally {
			if(out != null)
				out.close();
		}
		
	}
	
	public static void ficheroTxt() throws IOException{
		
		/*
		 * b) Introduce en un fichero 5 palabras y pide una letra. Muestra por pantalla cuántas veces se encuentra dicha letra en el fichero.
		 * */
		//Scanner sc = new Scanner(System.in);
		
		BufferedWriter writer = null;
		PrintWriter out = null;
		String nomFich;
		
		
		/*try {
			
			
			w = new BufferedWriter(new FileWriter("textos.txt"));
			/*for (String nuevaPalabra : texto) {
				System.out.println("texto del array: " + nuevaPalabra);
				
			}
			
			if(w != null) {
				texto = "Nuevo mensaje";
				w.write(texto);
				
				w.close();
				System.out.println(w);
			}
		
			//w.write(texto);
			//w.close();
			
			out.println(w);
			
		} finally {
			if(out != null)
				out.close();
		}*/
		
		
		try
		{
			Scanner sc = new Scanner(System.in);
			//String texto = "Hola";
			
		    writer = new BufferedWriter( new FileWriter( "txt.txt"));
		    System.out.printf("Introduce una letra: ");
		    writer.write("Hola");
		    //writer.write( "Quevedo");
		    System.out.println("texto dentro del txt --------------------> " + writer);

		}
		catch ( IOException e)
		{
		}
		finally
		{
		    try
		    {
		        if ( writer != null)
		        writer.close( );
		    }
		    catch ( IOException e)
		    {
		    }
		}
		
		String filePath = "C:\\Users\\danny\\Documents\\EclipseProjects\\PrimerProyecto\\src\\txt.txt";
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
		
		
		
		
	}
}
