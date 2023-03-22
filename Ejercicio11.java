package Maven;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class Ejercicio11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			URL urlcharacter = new URL("https://rickandmortyapi.com/api/character");
			HttpURLConnection concharacter = (HttpURLConnection) urlcharacter.openConnection();
			concharacter.connect();
			
			URL urllocation = new URL("https://rickandmortyapi.com/api/location");
			HttpURLConnection conlocation = (HttpURLConnection) urllocation.openConnection();
			conlocation.connect();
			
			URL urlepisode = new URL("https://rickandmortyapi.com/api/episode");
			HttpURLConnection conepisode = (HttpURLConnection) urlepisode.openConnection();
			conepisode.connect();
			
			int tiemporespuestacharacter = concharacter.getResponseCode();
			int tiemporespuestalocation = conlocation.getResponseCode();
			int tiemporespuestaepisode = conepisode.getResponseCode();

			if((tiemporespuestacharacter != 200) || (tiemporespuestalocation != 200) || (tiemporespuestaepisode != 200))
			{
				throw new RuntimeException("HttpResponseCode" + tiemporespuestacharacter + tiemporespuestalocation + tiemporespuestaepisode);
			}
			else 
			{
				StringBuilder informacioncharacter = new StringBuilder();
				StringBuilder informacionlocation = new StringBuilder();
				StringBuilder informacionepisode = new StringBuilder();

				
				Scanner scharacter = new Scanner(urlcharacter.openStream());
				Scanner slocation = new Scanner(urllocation.openStream());
				Scanner sepisode = new Scanner(urlepisode.openStream());

				while(scharacter.hasNext())
				{
					informacioncharacter.append(scharacter.nextLine());
				}
				while(slocation.hasNext())
				{
					informacionlocation.append(slocation.nextLine());
				}
				while(sepisode.hasNext())
				{
					informacionepisode.append(sepisode.nextLine());
				}
				scharacter.close();
				slocation.close();
				sepisode.close();
				System.out.println(informacioncharacter + "\n" + informacionlocation + "\n" + informacionepisode);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
