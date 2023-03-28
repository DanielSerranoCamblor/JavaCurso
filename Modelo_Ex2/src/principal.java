import java.awt.FlowLayout;
import java.awt.Image;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import org.json.JSONArray;
import org.json.JSONObject;

import org.json.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;
import java.net.MalformedURLException;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class principal {
	public static void main(String[] args) throws IOException 
	{
		//parseJSON p = new parseJSON();
		
		try {
		URL urlBerlin = new URL ("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m&current_weather=true");
		URL urlMadrid = new URL ("https://api.open-meteo.com/v1/forecast?latitude=40.42&longitude=-3.70&hourly=temperature_2m&current_weather=true");
		HttpURLConnection conBerlin = (HttpURLConnection) urlBerlin.openConnection();
		conBerlin.connect();
		HttpURLConnection conMadrid = (HttpURLConnection) urlMadrid.openConnection();
		conMadrid.connect();
		int tiempoDeRepuestaBerlin = conBerlin.getResponseCode();
		int tiempoDeRepuestaMadrid = conMadrid.getResponseCode();
		if (tiempoDeRepuestaBerlin != 200) //200 es el tiempo de respuesta correcto.
		{
			throw new RuntimeException("HttpResponseCode " + tiempoDeRepuestaBerlin);
		}
		else if(tiempoDeRepuestaMadrid != 200)
		{
			throw new RuntimeException("HttpResponseCode " + tiempoDeRepuestaMadrid);
		}
		else
		{
			StringBuilder informacionBerlin = new StringBuilder();
			StringBuilder informacionMadrid = new StringBuilder();
			Scanner sc = new Scanner(urlBerlin.openStream());
			Scanner sc1 = new Scanner(urlMadrid.openStream());

			while (sc.hasNext())
			{
				informacionBerlin.append(sc.nextLine());
				
			}
			
			while (sc1.hasNext())
			{
				informacionMadrid.append(sc1.nextLine());
				
			}
			JSONObject temperatura_berlin = new JSONObject (informacionBerlin.toString());
			JSONObject temperatura_madrid = new JSONObject (informacionMadrid.toString());
			HashMap<String,Object> hmBerlin = new HashMap<>();
			HashMap<String,Object> hmMadrid = new HashMap<>();

			//temperatura_berlin.remove()
			hmBerlin.put("temperature", (float)(temperatura_berlin.getJSONObject("current_weather").getFloat("temperature")));
			hmMadrid.put("temperature", (float)(temperatura_madrid.getJSONObject("current_weather").getFloat("temperature")));

			System.out.println("La temperatura en Berlin es:" + hmBerlin.get("temperature"));
			System.out.println("La temperatura en Madrid es:" + hmMadrid.get("temperature"));
			
			sc.close();	
			sc1.close();	
			// Condiciones de madrid
			float tempBerlin = (float)(temperatura_berlin.getJSONObject("current_weather").getFloat("temperature"));
			float tempMadrid = (float)(temperatura_madrid.getJSONObject("current_weather").getFloat("temperature"));
			if(tempBerlin<= 15) 
			{
				System.out.println("Algo sucedía en Berlin");
			}
			else
				System.out.println("Algo distinto");
			if(tempMadrid<= 15) 
			{
				System.out.println("Algo sucedía en Madrid");
			}
			else
				System.out.println("Algo distinto sucedía");

			//Declaracion de la estructura y normalización.
			/*
			p.setJSON(informacionBerlin.toString());
			p.setJSON(informacionMadrid.toString());
			System.out.println("La temperatura en Berlin es:" + p.getObjectHashMap("temperature"));
			System.out.println("La temperatura en Berlin es:" + p.getObjectHashMap("temperature"));
			*/
			
		}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
/*
//Normalización y declaración de los elementos a tomar de la información. 
class parseJSON
{
	private JSONObject jObject;
	private HashMap<String,Object> hm = new HashMap<>();
	
	public Object getObjectHashMap(String key)
	{
		return hm.get(key);
	}
	
	public void setJSON(String response)
	{
		jObject = new JSONObject(response);
		hm.put("temperature", (float)(jObject.getJSONObject("current_weather").getInt("temperature")));
	}
}
*/
