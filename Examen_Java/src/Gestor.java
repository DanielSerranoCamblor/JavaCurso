import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Gestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gestor gestor = new Gestor();
		gestor.txt();
	}
	public void txt() 
	{
		String rutaResultado = "C:\\Users\\dserranoc\\eclipse-workspace\\Examen_Java\\src\\Resultado.txt";
		File archivoResultado = new File(rutaResultado);
		FileWriter fw;
		
		try {
			fw = new FileWriter(archivoResultado);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String[] rutas = {"C:\\\\Users\\\\dserranoc\\\\eclipse-workspace\\\\Examen_Java\\\\src\\\\Vuelos.txt"};
			for(String ruta: rutas) 
			{
				int suma = 0;
				try{
					BufferedReader obj = new BufferedReader(new FileReader(ruta));
					obj.readLine();
					for(String line = obj.readLine(); line != null; line =obj.readLine()) 
					{
						// Vamos a imprimir por pantalla si lee linea a linea (sin contar la primera)
						//System.out.println(line);
						
						String[] split = line.split(",");
						String nombre = split[0].trim();
						int pasajeros = Integer.parseInt(split[1].trim());
						String tipo = split[2].trim();
						int valor = Integer.parseInt(split[3].trim());
						String fecha = split[4].trim();
						suma = suma + valor;
						Vuelos vuelos = new Vuelos(nombre, pasajeros, tipo, valor, fecha);
						bw.write(vuelos.getInfo());
					}
					bw.write("Suma de los valores Parciales: " + suma);
					
				}
				catch(IOException e1)
				{
					e1.printStackTrace();
				}
				
			}
			
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
