package Maven;


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
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Ejercicio13 {
	public static void main(String[] args) throws IOException 
	{
		try {
		URL url = new URL ("https://api.thecatapi.com/v1/images/search");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.connect();
		int tiempoDeRepuesta = con.getResponseCode();
		if (tiempoDeRepuesta != 200) //200 es el tiempo de respuesta correcto.
		{
			throw new RuntimeException("HttpResponseCode " + tiempoDeRepuesta);
		}
		else
		{
			StringBuilder informacion = new StringBuilder();
			Scanner sc = new Scanner(url.openStream());
			while (sc.hasNext())
			{
				informacion.append(sc.nextLine());
			}
			sc.close();	
			// Creamos object para sacar la imagen
			JSONArray p = new JSONArray(informacion.toString());
			System.out.println(p);
			JSONObject gato = p.getJSONObject(0);
			System.out.println(gato);
			//Diseño visual. 	
			URL urlImg = new URL(gato.getString("url"));
			System.out.println(gato.getString("url"));
			Image image = ImageIO.read(urlImg);
			image = image.getScaledInstance(gato.getInt("width"), gato.getInt("height"), Image.SCALE_DEFAULT);
			ImageIcon imageIcon = new ImageIcon(image);

			
			//JFrame es la ventana. Jframe es la clase que nos permite crear ventanas.
			JFrame jFrame = new JFrame();
			JLabel jLabel = new JLabel();
			System.out.println(jFrame.getBackground());
			
			jFrame.setLayout(new FlowLayout());
			jFrame.setSize(gato.getInt("width"), gato.getInt("height"));
			jLabel.setIcon(imageIcon);
			jFrame.add(jLabel);
			jFrame.setIconImage(image);
			jFrame.setVisible(true);
			jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

