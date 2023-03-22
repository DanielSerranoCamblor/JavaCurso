package Maven;
import java.io.IOException;
import java.net.HttpURLConnection; // Para geenerar hhttps
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			
			int tiemporespuesta = con.getResponseCode();
			if(tiemporespuesta != 200)
			{
				throw new RuntimeException("HttpResponseCode" + tiemporespuesta);
			}
			else 
			{
				StringBuilder informacion = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while(sc.hasNext())
				{
					informacion.append(sc.nextLine());
				}
				sc.close();
				System.out.println(informacion);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
