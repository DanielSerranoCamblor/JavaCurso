package Modelo_Examen;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Modelo_Examen extends Usuario {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		// Lectura de los .txt
		try {
			File doc1 = new File("C:\\Users\\dserranoc\\eclipse-workspace\\Maven\\src\\Modelo_Examen\\Usuarios_1.txt");
			File doc2 = new File("C:\\Users\\dserranoc\\eclipse-workspace\\Maven\\src\\Modelo_Examen\\Usuarios_2.txt");
			File doc3 = new File("C:\\Users\\dserranoc\\eclipse-workspace\\Maven\\src\\Modelo_Examen\\Usuarios_3.txt");

			BufferedReader obj1 = new BufferedReader (new FileReader(doc1));
			BufferedReader obj2 = new BufferedReader (new FileReader(doc2));
			BufferedReader obj3 = new BufferedReader (new FileReader(doc3));
			String caracteres1;
			String caracteres2;
			String caracteres3;
			while((caracteres1 = obj1.readLine()) != null)
				System.out.println(caracteres1);
			while((caracteres2 = obj2.readLine()) != null)
				System.out.println(caracteres2);
			while((caracteres3 = obj3.readLine()) != null)
				System.out.println(caracteres3);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		// Meter datos usando Set para no tener valores duplicados
		
		// Creación del .txt unificado
		try {
			String ruta = "C:\\\\\\\\Users\\\\\\\\dserranoc\\\\\\\\eclipse-workspace\\\\\\\\Maven\\\\\\\\src\\\\\\\\Usuarios_Unificado.txt";	
			String contenido = "Hola que tal? Me gusta la paella!!!!!!!";
			File archivo = new File(ruta);
			// Si el archivo no existe es creado.
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
}
