package Modelo_Examen;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;


public class Usuario extends Persona implements Interfaz{

	private LocalDate FechaRegistro;
	private LocalDate FechaLogin;
	private LocalDate UltimaFechaLogin;
	private int Comparas;
	
    public static void main(String[] args) 
    {
    	
    	try {
    		// Lectura de los .txt
				File doc1 = new File("C:\\Users\\dserranoc\\eclipse-workspace\\Maven\\src\\Modelo_Examen\\Usuarios_1.txt");
				File doc2 = new File("C:\\Users\\dserranoc\\eclipse-workspace\\Maven\\src\\Modelo_Examen\\Usuarios_2.txt");
				File doc3 = new File("C:\\Users\\dserranoc\\eclipse-workspace\\Maven\\src\\Modelo_Examen\\Usuarios_3.txt");
				String ruta = "C:\\\\\\\\Users\\\\\\\\dserranoc\\\\\\\\eclipse-workspace\\\\\\\\Maven\\\\\\\\src\\\\\\\\Usuarios_Unificado.txt";	
				File archivo = new File(ruta);
				BufferedReader obj1 = new BufferedReader (new FileReader(doc1));
				BufferedReader obj2 = new BufferedReader (new FileReader(doc2));
				BufferedReader obj3 = new BufferedReader (new FileReader(doc3));
				String caracteres1;
				String caracteres2;
				String caracteres3;
				Set<String> set1 = new HashSet<>();

				ArrayList<String> arr = new ArrayList<String>();
				while((caracteres1 = obj1.readLine()) != null)
					set1.add(caracteres1);
				while((caracteres2 = obj2.readLine()) != null)
					set1.add(caracteres2);
				while((caracteres3 = obj3.readLine()) != null)
					set1.add(caracteres3);
				
				System.out.println(set1);
				Usuario user = new Usuario();

				
				// Si el archivo no existe es creado.
				String contenido = ""; // En este igual habrá que poner lo que contenga la info de los datos
				if (!archivo.exists())
					{
						archivo.createNewFile();
					}
				FileWriter fw = new FileWriter(archivo);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(contenido);
				bw.close();
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
    }

	@Override
	public int suma(String a, String b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LocalDate edad(String a, String b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String segmento(int a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String status(int a) {
		// TODO Auto-generated method stub
		return null;
	}
}
