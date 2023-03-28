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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
			
			sc.close();	
			sc1.close();	
			// Condiciones de madrid y berlin
			float tempBerlin = (float)(temperatura_berlin.getJSONObject("current_weather").getFloat("temperature"));
			float tempMadrid = (float)(temperatura_madrid.getJSONObject("current_weather").getFloat("temperature"));
			String AccionMadrid;
			String AccionBerlin;
			if(tempBerlin>= 20) 
			{
				AccionBerlin ="Se realizaran tareas de Producción.";
			}
			else
				AccionBerlin ="Se realizaran tareas de Mantenimiento.";
			if(tempMadrid>= 15) 
			{
				AccionMadrid ="Se realizaran tareas de Producción y no de sembrado.";
			}
			else
				AccionMadrid =" Se realizaran tareas de sembrado.";
			

			System.out.println("Temp Madrid: " + tempMadrid + "\n" + AccionMadrid + "\n" + 
					"Temp Madrid: " + tempBerlin + "\n" + AccionBerlin);
			
			String ruta = "C:\\Users\\dserranoc\\eclipse-workspace\\Modelo_Ex2\\src\\recomendación_diaria.txt";	
			String contenido = "Temp Madrid: " + tempMadrid + "\n" + AccionMadrid + "\n" + 
					"Temp Madrid: " + tempBerlin + "\n" + AccionBerlin;
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
			/*//Diseño visual. 
			URL urlImg = new URL((String) p.getObjectHashMap("icon"));
			Image image = ImageIO.read(urlImg);
			ImageIcon imageIcon = new ImageIcon(image);
			//JFrame es la ventana. Jframe es la clase que nos permite crear ventanas.
			JFrame jFrame = new JFrame();
			jFrame.setBackground(Color.blue);
			System.out.println(jFrame.getBackground());
			JLabel jLabel = new JLabel();
			JLabel date = new JLabel(p.getObjectHashMap("date").toString());
			JLabel s1 = new JLabel(p.getObjectHashMap("weather").toString());
			//Diseño
			date.setSize(30,30);
			s1.setSize(10,10);
			jFrame.setLayout(new FlowLayout());
			jFrame.setSize(1000+10, 300+40);
			jLabel.setIcon(imageIcon);
			jFrame.add(jLabel);
			jFrame.add(date);
			jFrame.add(s1);
			jFrame.setIconImage(image);
			jFrame.setVisible(true);
			jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	*/
			

		}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}